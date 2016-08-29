#include <stdio.h>
#include <stdlib.h>

typedef struct
{
    char name[20];
    float assignment[5];
    float test[2];
    float endSem,totalScore;
}student;

void read(student *s)
{
        printf("Enter name:\n");
        scanf("%s",(*(s)).name);
        printf("Enter 5 assignment scores:\n");
        scanf("%f %f %f %f %f",&(*(s)).assignment[0],&(*(s)).assignment[1],&(*(s)).assignment[2],&(*(s)).assignment[3],&(*(s)).assignment[4]);
        printf("Enter 2 test scores:\n");
        scanf("%f %f",&(*(s)).test[0],&(*(s)).test[1]);
        printf("Enter endsem score:\n");
        scanf("%f",&(*(s)).endSem);
}
void compute(student *s)
{
    (*(s)).totalScore=(*(s)).assignment[0]+(*(s)).assignment[1]+(*(s)).assignment[2]+(*(s)).assignment[3]+(*(s)).assignment[4]+(*(s)).test[0]+(*(s)).test[1]+(*(s)).endSem;
}
void print(student s)
{
    printf("Name: %s\t",s.name);
    printf("Total Marks: %f\n",s.totalScore);
}
int main()
{
    student s[100];
    int n,i;
    printf("Enter number of students:\n");
    scanf("%d",&n);;
    for(i=0;i<n;i++)
    {
        read(&s[i]);
        compute(&s[i]);

    }
    for(i=0;i<n;i++)
        print(s[i]);
    return 0;
}
