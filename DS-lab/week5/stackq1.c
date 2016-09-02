#include<stdio.h>
#include<stdlib.h>
#include"stack.h"

int main()


{
	stack s;
	char arr[15];
	char a,c;
	int i=0;
	printf("enter the character array");
	scanf("%s",arr);
	s.top=-1;
	while((c=arr[i++])!='\0')
		push(&s,c);
	while (1)
	{	int x=0;
		printf("1.push 2.pop 3.display 4.exit : ");
		scanf("%d",&x);
		switch(x){
		case 1: printf("enter element\n");
				getchar();
				scanf("%c",&a);
				push(&s,a);
				break;
		case 2: pop(&s);
				break;
		case 3: display(&s);
				break;
		}
	if(x>3&&x<1)
		break;
	}
}
