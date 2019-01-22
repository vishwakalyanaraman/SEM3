/*
 * Q4.c
 *
 *  Created on: 22-Jan-2019
 *      Author: Vishwa Kalyanaraman
 *      Input a string and use N processes
 *      to find the number of non-vowels
 */

#include <stdio.h>
#include <mpi.h>
#include <stdlib.h>
#include <string.h>

int checkVowel(char x){
	if(x != 'a' && x != 'e' && x != 'i' && x != 'o' && x != 'u')
		return 0;
	else return 1;
}

void main(int argc, char* argv[]){
	int rank, size;
	char str[100];
	char rec[100];
	int len = atoi(argv[1]);
	int count = 0, totcount;

	MPI_Init(&argc, &argv);

	MPI_Comm_rank(MPI_COMM_WORLD, &rank);
	MPI_Comm_size(MPI_COMM_WORLD, &size);
	int vow[size];

	if (rank == 0){
		printf("Enter the string (Length should be %d)\n", len);
		gets(str);
		MPI_Bcast(&len, 1, MPI_INT, 0, MPI_COMM_WORLD);
	}

	MPI_Scatter(str, len/size, MPI_CHAR, rec, len/size, MPI_CHAR, 0, MPI_COMM_WORLD);

	for(int i = 0; i < len/size; i++)
		if(!checkVowel(rec[i]))
			count++;

	printf("RANK %d | Non-Vowels = %d\n", rank, count);

	MPI_Gather(&count, 1, MPI_INT, vow, 1, MPI_INT, 0, MPI_COMM_WORLD);

	if(rank == 0){
		for(int i = 0; i < size; i++)
			totcount += vow[i];
		printf("Total count = %d\n", totcount);
	}

	MPI_Finalize();
}
