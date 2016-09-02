#include<stdio.h>
#include<stdlib.h>

struct complex
{
      float real;
      float img;
}a,b,c;

void print(struct complex z)
{	if(z.img>=0)
	printf("%f+%fi",z.real,z.img);
	else
	printf("%f%fi",z.real,z.img);

}
struct complex read()
{	struct complex z;
	printf("enter real and imaginary part:\n");
	scanf("%f%f",&z.real,&z.img);
	return z;
}
struct complex add(struct complex x,struct complex y)
{	struct complex z;
	z.real=x.real+y.real;
	z.img=x.img+y.img;
	return z;	
}
struct complex sub(struct complex x,struct complex y)
{	struct complex z;
	z.real=x.real-y.real;
	z.img=x.img-y.img;
	return z;	
}
struct complex mul(struct complex x,struct complex y)
{	struct complex z;
	z.real=x.real*y.real-x.img*y.img;
	z.img=x.real*y.img+x.img*y.real;
	return z;	
}
int main()
{	printf("\nenter a\n ");
	a=read();
	print(a);
	printf("\nenter b\n ");
	b=read();
	print(b);
	
	printf("\nsum of a and b is :\n");
	print(add(a,b));
	printf("\nsubtraction of a and b is :\n");
	print(sub(a,b));
	printf("\nproduct of a and b is :\n");
	print(mul(a,b));

}
