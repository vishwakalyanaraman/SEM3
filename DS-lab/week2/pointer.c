/*author- Ankush Anshuman

pointer passing and returning from function

*/

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int *add(int *m,int *n)
{	int sum;
	int *p=&sum;
	sum=*m+*n;
	return p;
}

int main()
{
    int m,n,*p,**q;
    printf("enter the two numbers\n");
    scanf("%d%d",&m,&n);
	p=add(&m,&n);
	q=&p;
        
    printf("sum is %d", **q);
 
    return 0;
}
