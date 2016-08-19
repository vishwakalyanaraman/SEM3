/*author- Ankush Anshuman

sum of two elements

*/

#include <stdio.h>
#include <stdlib.h>


int main()
{
    int m,n,*p,*q;
    p=&m;
    q=&n;
    printf("enter the two numbers :\n");
    scanf("%d%d",p,q);
	int sum=*p+*q;
        
        printf("sum is %d", sum);
    return 0;
}
