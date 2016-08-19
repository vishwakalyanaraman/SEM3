/*author- Ankush Anshuman

roots of quadratic equation

*/


#include <stdio.h>
#include <stdlib.h>
#include <math.h>


void getdata(int *p,int *q,int *r)
{
printf("enter the cofficients of a,b and c : \n" );
scanf("%d%d%d",p,q,r);
}

void quadratic(int *p,int *q, int *r,float *x,float *y)
{
	float delta = pow(*q,2)-4* (*p) *(*r);
	delta=sqrt(delta);
	*x=(-(*q)+delta)/2**p;
	*y=(-(*q)-delta)/2**p;
}
void printroots(float *x, float *y)
{
	printf("roots are %f and %f\n",*x,*y);
}

int main()
{int a,b,c;
	float r1,r2;

getdata(&a,&b,&c);

quadratic(&a,&b,&c,&r1,&r2);

printroots(&r1,&r2);
}
