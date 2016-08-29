#include <stdio.h>
#include <stdlib.h>
typedef enum{FALSE,TRUE}BOOL;
typedef struct 
{
	char* data;
	int top;
	int size;
}Stack;

int isFull(Stack s)
{
	return s.size==s.top;
}

int isEmpty(Stack s)
{
	return s.top==-1;
}

void flush( void )
{
    int c;
    while( (c = fgetc( stdin )) != EOF && c != '\n' );
}



void pop(Stack *s)
{
	s->top--;
}

void disp(Stack s)
{
	if(isEmpty(s))
		printf("Empty Stack\n");
	else
	{


		int i=0;
		for(i=0;i<=s.top;i++)
		{
			printf("%c ",s.data[i]);
		}
	}

	printf("\n");
}
void dynamicAlloc(Stack *s)
{
	char* temp;
	temp=(char*)malloc(2*s->size*sizeof(char));
	int i;
	for(i=0;i<=s->top;i++)
		temp[i]=s->data[i];
	free(s->data);
	s->data=NULL;
	s->data=temp;
	temp=NULL;
	s->size=2*s->size;
}


void push(Stack *s,char ele)
{
	if(isFull(*s))
		dynamicAlloc(s);
	s->data[++s->top]=ele;
}

int main()
{
	Stack s;
	s.top=-1;
	s.size=5;
	
	s.data=(char*)malloc(5*sizeof(char));
	char ans='n';
	do
	{
		int ch=0;	
		printf("1.Push\n");
		printf("2.Pop\n");
		printf("3.Disp\n");
		printf("4.Full Check\n");
		printf("5.Empty Check\n");
		printf("6.Disp\n");
		printf("7.Exit\nEnter number:");
		//int ch;
		scanf("%d",&ch);
		flush();
		char c;	
		switch(ch)
		{
			case 1:
					
					printf("Enter element: ");
					scanf("%c",&c);
					flush();
					push(&s,c);
					printf("Do you wish to coninue(y/n)?");
					scanf("%c",&ans);
					flush();
					break;
			case 2:
					if(!isEmpty(s))
						pop(&s);
					printf("Do you wish to coninue(y/n)?");
					scanf("%c",&ans);
					flush();
					break;
			case 3:
					disp(s);
					printf("Do you wish to coninue(y/n)?");
					scanf("%c",&ans);
					flush();
					break;
			case 4:
					if(isFull(s))
						printf("it is Full\n");
					else
						printf("it is not Full\n");
					printf("Do you wish to coninue(y/n)?");
					scanf("%c",&ans);
					flush();
			case 5:
					if(isEmpty(s))
						printf("it is Empty\n");
					else
						printf("it is not Empty\n");
					printf("Do you wish to coninue(y/n)?");
					scanf("%c",&ans);
					flush();
					break;
			case 6:
					disp(s);
					printf("Do you wish to coninue(y/n)?");
					scanf("%c",&ans);
					flush();	
					break;

			case 7:
					exit(0);

		}


	}while(ans=='y');

	
	return 0;
}