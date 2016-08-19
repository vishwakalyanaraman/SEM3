/*author- Ankush Anshuman

biggest elements in array

*/

#include <stdio.h>
#include <stdlib.h>


int biggest(int a[],int n)
{
	int max=0;
    for(int i=0;i<n;i++)
    {
			if(a[i]>=max)
			max=a[i];
	}
    return max;
}

int main()
{
    int n,a[100];
    printf("enter the number of element\n");
    scanf("%d",&n);

    for(int i=0;i<n;i++)
        scanf("%d",&a[i]);
        
        printf("biggest is %d", biggest(a,n));
    return 0;
}
