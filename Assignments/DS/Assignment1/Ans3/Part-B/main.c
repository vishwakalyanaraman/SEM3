#include <stdio.h>

void main()
{
    int a[10][10];
    int *p=a;
    int m,n,i,j;
    printf("Enter number of rows and columns:\n");
    scanf("%d %d",&m,&n);
    printf("Enter elements:\n");
    int k=0;
    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
            scanf("%d",(p+k));
            k++;
        }
    }
    printf("Elememts of the 2D array are:\n");
    k=0;
    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
            printf("%d ",*(p+k));
            k++;
        }

        printf("\n");
    }
}
