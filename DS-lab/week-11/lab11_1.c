#include<stdio.h>
typedef struct node
{
    int data;
    struct node* ll,*rl;
}*NODE;

NODE create(NODE root,int x)
{
    NODE cur;
    if(root==NULL)
    {
        root=(struct node *) malloc(sizeof(struct node));
        root->data=x;
        root->ll=root->rl=NULL;
    }
    else if(x>root->data)
        root->rl=create(root->rl,x);
    else if(x<root->data)
        root->ll=create(root->ll,x);
    return root;
}
NODE inorder_succ(NODE a)
{
    NODE p=a;
    if(p->rl!=NULL)
   p=p->rl;
   while(p->ll->ll!=NULL)
   {
        p=p->ll;
   }
   return p;
}
void del(NODE root,int val)
{
    NODE succ=NULL;
    NODE p,cur;
    int temp;
    p=root;cur=NULL;
    if(p->data>val)
        cur=p->ll;
    else
        cur=p->rl;
    while(p!=NULL)
    {
        if(cur->data==val)
            break;
    else if(cur->data>val)
    {
        p=cur;
        cur=cur->ll;
    }
    else if(cur->data<val)
    {
        p=cur;
        cur=cur->rl;
    }
    }
   // printf("%d\t%d",p->data,cur->data);
   if(cur->ll==cur->rl&&cur->ll==NULL)
   {
       if(p->data>cur->data)
        p->ll=NULL;
       else
        p->rl=NULL;
       free(cur);
   }
   else if(cur->ll==NULL)
   {
       if(p->rl==cur)
       {
        p->rl=cur->rl;
        cur->ll=cur->rl=NULL;
        free(cur);
       }
       else
       {
           p->ll=cur->rl;
        cur->ll=cur->rl=NULL;
        free(cur);
       }


   }
   else if(cur->rl==NULL)
   {
       if(p->rl==cur)
       {
        p->rl=cur->ll;
        cur->ll=cur->rl=NULL;
        free(cur);
       }
       else
       {
           p->ll=cur->ll;
        cur->ll=cur->rl=NULL;
        free(cur);
       }
   }
   else
   {
       succ=inorder_succ(cur);
       printf("\n\n%d",succ->ll->data);
       temp=cur->data;
       cur->data=succ->ll->data;
       succ->ll->data=temp;
       succ->ll=NULL;
       free(succ->ll);

   }

}

void inorder(NODE root)
{

    if(root==NULL)
        return;
    else
    {
        inorder(root->ll);
        printf("%d\t",root->data);
        inorder(root->rl);
    }

}
int main()
{
    NODE root=NULL;
    char ch;
    int x;
    while(ch!='n')
    {
        scanf("%d",&x);
        root=create(root,x);
        printf("\nmore?");
        scanf(" %c",&ch);
    }
    printf("\n");
    inorder(root);
    printf("\n");
    int del_ele;
    scanf("%d",&del_ele);
    del(root,del_ele);
    printf("\n");
    inorder(root);


}
