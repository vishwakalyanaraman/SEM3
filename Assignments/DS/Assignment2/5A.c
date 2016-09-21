#include<stdio.h>
#include<stdlib.h>
#include<string.h>8
#include<ctype.h>
char    operand[50];
int top;
void push(int   ele)
{
    if(top!=49)
    {
     operand[++top]=ele;
    }
}
char    pop()
{
    char    c;
    c=operand[top];
    top--;
    return  c;
}
int main()
{
    char    prefix[50],ch,postfix[50],op1,op2;
    int i=0,j=0,len=0,ct=0;
    gets(prefix);
    len=strlen(prefix);
    i=len-1;
    for(;i>=0;i--)
    {   ch=prefix[i];
        if(isalnum(ch))
        {
            push(ch);
        }
        else
        {
            if(ct==0)
            {
              op1=pop();
              op2=pop();
              postfix[j++]=op1;
              postfix[j++]=op2;
              postfix[j++]=ch;
              ct++;
            }
            else
            {
                op2=pop();
                postfix[j++]=op2;
                postfix[j++]=ch;
            }
        }
    }
    postfix[j]='\0';
    puts(postfix);
    return  0;
}
