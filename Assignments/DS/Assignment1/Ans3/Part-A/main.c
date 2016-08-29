#include<stdio.h>

int *odd(int N)
{
    int *a,i,j;
    a=calloc(N,sizeof(int));
    for(i=1,j=0;j<=N;i+=2,j++)
        *(a+j)=i;
    return a;
}
void main()
{
    int n,i;
    int *a;
    printf("Enter number of odd numbers:\n");
    scanf("%d",&n);
    a=odd(n);
    for(i=0;i<n;i++)
        printf("%d ",*(a+i));
}
