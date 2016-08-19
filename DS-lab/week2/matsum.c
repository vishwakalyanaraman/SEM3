/*author- Ankush Anshuman

sum of two matrix
*/
#include <stdio.h>
#include <stdlib.h>


void add(int a[][100],int b[][100],int m,int n)
{	int sum[100][100]={0};
    for(int i=0;i<m;i++)
    {	for(int j=0;j<n;j++)
		sum[i][j]=a[i][j]+b[i][j];
    }
    
    for(int i=0;i<m;i++)
    {	for(int j=0;j<n;j++)
		printf("%d\t",sum[i][j]);
	printf("\n");
	}

}

int main()
{
    int m,n,a[100][100],b[100][100];
    printf("enter the number rows : ");
     scanf("%d",&m);
    printf("enter the number columns : ");
    scanf("%d",&n);
	
	printf("enter first matrix : \n");
    for(int i=0;i<n;i++)
    {	for(int j=0;j<n;j++)
        scanf("%d",&a[i][j]);
    }
    
    printf("enter second matrix : \n");
    for(int i=0;i<n;i++)
    {	for(int j=0;j<n;j++)
        scanf("%d",&b[i][j]);
    }
    
    add(a,b,m,n);
    
    
    return 0;
}

