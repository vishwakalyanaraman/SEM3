#include<stdio.h>
#include"stack.h"

int main()
{
		stack s;
		char c;
		int i=0,j=0,f=0;
		s.top=-1;
		char arr[100];
		scanf("%s",arr);
		while((c=arr[i++])!='\0')
			push(&s,c);
		while(!empty(&s))
			{
				if(pop(&s)!=s.item[j++])
				{	f=1;
					break;}
				
			}
			
			if(f==1)
				printf("not palindrome");
				else printf("palindrome");
}
