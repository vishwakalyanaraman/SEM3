#include<stdio.h>
#include"intstack.h"


int main()
{
		int a;
		stack s;
		s.top=-1;
		printf("enter decimal number:\n");
		scanf("%d",&a);
		while(a>0)
		{	
				push(&s,a%2);
				a=a/2;
		}
		display(&s);

		
}
