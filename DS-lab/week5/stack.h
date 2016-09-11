#define MAX 50
#define true 1
#define fasle 0

typedef struct
{
		char item[MAX];
		int top;
}stack;
char pop(stack *ps);
void push(stack *ps,char x);
void display();

int empty(stack *ps)
{
	if(ps->top==-1)
		return(true);
	else return fasle;
}

char pop(stack *ps)
{
	if(!empty(ps))
		return (ps->item[ps->top--]);
	else printf("\nerror: stack is empty\n"); 
	
	return '#';
}
void push(stack *ps,char x)
{
	if(ps->top!=MAX-1)
	{	ps->top++;
		ps->item[ps->top]=x;
	}
	else printf("\nerror: stack is full\n");
}


void display(stack *ps)
{	for (int i=0;i < (ps->top)+1 ; i++)
		printf("%c ", ps->item[i]);
	printf("\n");
}	
