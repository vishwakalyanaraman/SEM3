#include<stdio.h>
#include<stdlib.h>

typedef struct
{
      char first[10];
      char last[10];
}Name;
typedef struct
{
   int roll;
   Name name;
}student;

int main()
{
	student s[100];
	int n,i;
	printf("enter the number of students:\n");
	scanf("%d",&n);
	
	for(i=0;i<n;i++)
	{
	printf("enter details of student %d :\n",i+1);
	printf("enter first name:\n");
	scanf("%s",s[i].name.first);
	printf("enter last name:\n");
	scanf("%s",s[i].name.last);
	printf("enter roll number:\n");
	scanf("%d",&s[i].roll);
	}
	
	
	for(i=0;i<n;i++)
	{	for(int j=0;j<n;j++)
		{
			if(s[i].roll<s[j].roll)
			{
				student temp=s[i];
				s[i]=s[j];
				s[j]=temp;
			}
		}
	}
	
	for(i=0;i<n;i++)
	{
	printf("\ndetails of student %d :\n",i+1);
	printf("name: %s %s\n",s[i].name.first,s[i].name.last);
	printf("enter roll number: %d\n",s[i].roll);
	}

}
