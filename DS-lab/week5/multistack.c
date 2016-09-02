#include<stdio.h>
#include"stack.h"


stack s[10];

void add(int n,char x)
{
	push(&s[n],x);
}

void delete(int n)
{
	pop(&s[n]);
}

int main()
{
int n,i;
char x;
while(1){
	printf("1.ADD 2.DELETE  3.DISPLAY: ");
	scanf("%d",&n);
	printf("enter stack number: ");
	scanf("%d",&i);
	if(n==1)
		{ printf("enter element : ");
		scanf("%c",&x);
		add(i,x);
		}
	else if (n==2)
		delete(i);
	else if (n==3)
		display(&s[i]);
}
}
