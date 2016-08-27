import java.util.*;
class Counter
{
	static int count=0;
	Counter()
	{
		count++;
	}
	static void showCount()
	{
		System.out.println("Number of objects created are: "+count);
	}
}

class CounterDemo
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("Enter number of objects to be created:");
		n=s.nextInt();
		Counter c[]=new Counter[n];
		for(int i=0;i<n;i++)
		{
			c[i]=new Counter();
			Counter.showCount();
		}
	}

	
}
