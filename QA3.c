/*
 * QA3.c
 *
 *  Created on: 22-Jan-2019
 *      Author: Vishwa Kalyanaraman
 *      QA3: Find sum of 1+2+...element for each element
 */

/*
 * QA2.c
 *
 *  Created on: 22-Jan-2019
 *      Author: Vishwa Kalyanaraman
 *      Additional Q2: Find square of first M, cube of next M and so on...
 */

#include <mpi.h>
#include <stdio.h>
#include <stdlib.h>
#include <math.h>

void main(int argc, char* argv[]){
	int rank, size;
	int m = atoi(argv[1]);
	MPI_Init(&argc, &argv);
	MPI_Comm_rank(MPI_COMM_WORLD, &rank);
	MPI_Comm_size(MPI_COMM_WORLD, &size);
	int b[size];
	int a[size];

	if (rank == 0){
		printf("Enter elements of array %dx%d:\n",size,m);
		for(int i = 0; i < size*m; i++)
			scanf("%d", &a[i]);
	}
	MPI_Scatter(a, size, MPI_INT, b, size, MPI_INT, 0, MPI_COMM_WORLD);

	for(int i = 0; i < size; i++){
		for(int j = 1; j < a[i]; j++){
			b[i] += j;
		}
	}

	if(rank != size-1){
		printf("RANK %d | Values = ", rank);
		for(int i = 0; i < size; i++)
			printf("%d ",b[i]);
		printf("\n");
	}

	MPI_Finalize();
}



