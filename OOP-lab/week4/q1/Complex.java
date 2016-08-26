import java.util.*;

class Complex
{
	private float real,im;
	Complex()
	{
		real=0;
		im=0;
	}
	Complex(float a,float b)
	{
		real=a;
		im=b;
	}
	Complex(Complex a)
	{
		real=a.real;
		im=a.im;
	}
	public void assign(float a,float b)
	{
		real=a;
		im=b;
	}
	public Complex add(Complex a)
	{
		Complex sum=new Complex();
		sum.real=a.real+real;
		sum.im=a.im+im;
		return sum;
		
	}
	public Complex subtract(Complex a)
	{
		Complex diff=new Complex();
		diff.real=real-a.real;
		diff.im=im-a.im;
		return diff;
		
	}
	public void display()
	{
		System.out.println(real+"+ i "+im);
	}
}
