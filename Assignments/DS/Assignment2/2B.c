/*Recursion to find Combination(Factorial)*/
#include <stdio.h>

int fact(int n)
{
	
	if(n>=1)
		return n*fact(n-1);
	else
		return 1;
}

int Combination(int n,  int r)
{
	return fact(n)/(fact(r)*fact(n-r));
}

int main()
{
	printf("Enter n and r\n");
	int n, r;
	scanf("%d%d",&n,&r);
	printf("Combination nCr is : %d\n",Combination(n,r));
	return 0;
}