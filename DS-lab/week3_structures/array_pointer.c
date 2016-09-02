#include <stdio.h>
#include <stdlib.h>

int main()
{
		int n,a[100],*p,i;
		printf("enter the size of array:\n");
		scanf("%d",&n);
		for( i=0;i<n;i++)
			scanf("%d",&a[i]);
		p=a;
		printf("\narray is:\n");
		for(i=0;i<n;i++)
		{	printf("%d ",*p);
			p++;
		}
		printf("\n");
		printf("\nreverse array:\n");
		p=a+n-1;
		for(i=0;i<n;i++)
		{	printf("%d ",*p);
			p--;
		}

}
