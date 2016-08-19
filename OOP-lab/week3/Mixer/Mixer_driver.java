import java.util.*;
class Mixer_driver
{
	public static void main(String args[])
	{
		Mixer a,b;
		a=new Mixer();
		b=new Mixer();
		a.accept();
		b.accept();
		Mixer c=a.merge(b);
		System.out.println("Merged array is ");
		c.print();
	}
}
