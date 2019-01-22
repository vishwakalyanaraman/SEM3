/*
 * Q3.c
 *
 *  Created on: 22-Jan-2019
 *      Author: Vishwa Kalyanaraman
 *      Finds average of M elements using N processes
 */

#include <mpi.h>
#include <stdio.h>
#include <stdlib.h>

void main2(int argc, char* argv[]){
	int rank, size;
	int m = atoi(argv[1]);
	int avg = 0;
	MPI_Init(&argc, &argv);
	MPI_Comm_rank(MPI_COMM_WORLD, &rank);
	MPI_Comm_size(MPI_COMM_WORLD, &size);
	int b[size];
	int a[size];

	if (rank == 0){
		//int a[size*m];
		printf("Enter elements of array %dx%d:\n",size,m);
		for(int i = 0; i < size*m; i++)
			scanf("%d", &a[i]);
	}
	MPI_Scatter(a, m, MPI_INT, b, m, MPI_INT, 0, MPI_COMM_WORLD);
	for(int i = 0; i < m; i++)
		avg += b[i];
	int finavg = avg/m;

	printf("RANK %d | Average = %d\n",rank, finavg);

	MPI_Gather(&finavg, 1, MPI_INT, a, 1, MPI_INT, 0, MPI_COMM_WORLD);

	if (rank == 0){
		int tot = 0;
		for(int i = 0; i < size; i++){
			tot += a[i];
			printf("%d||", a[i]);
		}
		printf("TOTAL AVERAGE = %d\n", tot/m);
	}
	MPI_Finalize();
}

