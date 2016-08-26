import java.util.*;

class Complex_demo
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		Complex a,b,sum,diff;
		float x,y;
		System.out.println("Enter two complex numbers:");
		a=new Complex();
		x=s.nextFloat();
		y=s.nextFloat();
		a.assign(x,y);		
		x=s.nextFloat();
		y=s.nextFloat();
		b=new Complex(x,y);
		sum=new Complex(a.add(b));
		diff=new Complex(a.subtract(b));
		System.out.print("Sum of the two complex numbers is ");
		sum.display();
		System.out.print("Difference of the complex numbers is ");
		diff.display();
	}
}
