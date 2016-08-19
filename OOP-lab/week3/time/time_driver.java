import java.util.*;
class time_driver
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		Time a=new Time();
		Time b=new Time();
		Time sum,diff;
		System.out.println("Enter two time:");
		int h,m,se;
		h=s.nextInt();
		m=s.nextInt();
		se=s.nextInt();
		a.assign(h,m,se);
		h=s.nextInt();
		m=s.nextInt();
		se=s.nextInt();
		b.assign(h,m,se);
		sum=a.add(b);		
		System.out.print("The sum of the times is ");
		sum.print();
		System.out.println();
		System.out.print("The difference of the times is ");
		if(a.compare(b)==1)
			diff=a.subtract(b);
		else
			diff=b.subtract(a);
		diff.print();
		System.out.println();
		int c=sum.compare(diff);
		if(c==1)
		{
			sum.print();
			System.out.print("is greater than ");
			diff.print();
			System.out.println();
		}
		else if (c==-1)
		{
			diff.print();
			System.out.print("is greater than ");
			sum.print();
			System.out.println();
		}
		else
		{
			sum.print();
			System.out.print("is equal to ");
			diff.print();
			System.out.println();
		}
	}
}
