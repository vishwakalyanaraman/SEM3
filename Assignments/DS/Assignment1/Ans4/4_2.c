#include<stdio.h>
#include<stdlib.h>

int * copyto1D(int ** table)
{
	int no=0,i=0,j,k=0,rNum;
	while(table[i]!=NULL)
		no+=table[i++][0];
	rNum=i;
	int * a= calloc(no+1,sizeof(int));
	for(i=0;i<rNum;i++)
		for(j=1;j<=table[i][0];j++)
			a[k++]=table[i][j];
			
	*(a+no)='\0';
	return a;
}

void main()
{
	int rNum,cNum,i,j;
	printf("Enter elements\n");
	printf("Enter Row Number\n");
	scanf("%d",&rNum);
	int **table = calloc(rNum+1,sizeof(int *));
	table[rNum]=NULL;
	for(i=0;i<rNum;i++)
	{
		printf("Enter column size %d \n",i+1);
		scanf("%d",&cNum);
		table[i]=calloc(cNum+1,sizeof(int));
		table[i][0]=cNum;
		for(j=1;j<=table[i][0];j++)
			scanf("%d",&table[i][j]);
	}  
	
	printf("\nElements are\n");
	for(i=0;i<rNum;i++)
		{for(j=1;j<=table[i][0];j++)
			printf("%d ",table[i][j]);	
		 printf("\n");}
	
	printf("\n\n1D Array is\n") 	
	int * a = copyto1D(table);
	i=0;
	while(a[i]!='\0')
		printf("%d ",a[i++]);
			
}