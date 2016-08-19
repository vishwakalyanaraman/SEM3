/* Biggest.c

	Author: Ronald Das
	Date Created: 18-08-2016

	C Code to compute the biggest element of an Array.


*/
#include <stdio.h>
void biggest(int siz, int b[]);

int main()
{
	int i,n,a[10];
	printf("Enter size\n");
	scanf("%d",&n);
	for(i = 0; i < n; i++)
	{
		scanf("%d",&a[i]);
	}
	biggest(n,a);
	return 0;
}

void biggest(int siz, int b[])
{
	int i,j,big=b[0];

	for(i = 0; i < siz; i++)
	{
		if(big < b[i])
		{
			big = b[i];
		}
	}

	printf("\n Biggest element is %d\n",big);
}