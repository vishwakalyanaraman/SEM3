/*author- Ankush Anshuman

sum of elements in array

*/
#include <stdio.h>
#include <stdlib.h>



int add(int a[],int n)
{
	int sum=0;
    for(int i=0;i<n;i++)
    sum=sum+a[i];
    return sum;
}

int main()
{
    int n,a[100];
    printf("enter the number of element\n");
    scanf("%d",&n);

    for(int i=0;i<n;i++)
        scanf("%d",&a[i]);
        
        printf("sum is %d", add(a,n));
    return 0;
}
