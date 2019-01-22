/*
 * Q1.c
 *
 *  Created on: 22-Jan-2019
 *      Author: Vishwa Kalyanaraman
 *      Scatter values to N processes and finds factorial
 */

#include <mpi.h>
#include <stdio.h>
#include <stdlib.h>

void main1(int argc, char* argv[]){
	int rank, size, x;
	MPI_Init(&argc, &argv);
	MPI_Comm_size(MPI_COMM_WORLD, &size);
	MPI_Comm_rank(MPI_COMM_WORLD, &rank);
	int a[size];
	int b[size];

	if (rank == 0){
		printf("Enter the values\n");
		for(int i = 0; i < size; i++)
			scanf("%d", &a[i]);
	}

	MPI_Scatter(a, 1, MPI_INT, &x, 1, MPI_INT, 0, MPI_COMM_WORLD);
	int val = 1;
	for(int i = x; i > 0; i--)
		val *= i;

	printf("RANK %d | Value = %d, Factorial = %d\n",rank, x, val);
	MPI_Gather(&val, 1, MPI_INT, b, 1, MPI_INT, 0, MPI_COMM_WORLD);

	if(rank == 0){
		int sum = 0;
		for(int i = 0; i < size; i++)
			sum += b[i];
		printf("\nSum of factorial = %d\n", sum);
	}
	MPI_Finalize();
}
