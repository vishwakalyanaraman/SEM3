#include<stdio.h>
#include<stdlib.h>

int memRelease(int ** a)
{	
	free(*a);
	*a=NULL;
	if(*a==NULL)
		return 1;
	else
		return -1;
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
		 	
	for(i=0;i<rNum;i++)
		j=memRelease(&table[i]);

	free(table);

}
