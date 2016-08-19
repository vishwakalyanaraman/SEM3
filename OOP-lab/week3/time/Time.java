class Time
{
	private int hh,mm,ss;
	public void assign(int a,int b,int c)
	{
		hh=a;
		mm=b;
		ss=c;
	}
	public Time add(Time a)
	{
		Time sum=new Time();
		sum.ss=ss+a.ss;
		int carry=0;
		if(sum.ss>=60)
		{
			carry=sum.ss/60;
			sum.ss=sum.ss%60;
		}
		sum.mm=mm+a.mm+carry;
		carry=0;
		if(sum.mm>=60)
		{
			carry=sum.mm/60;
			sum.mm=sum.mm%60;
		}
		sum.hh=carry+hh+a.hh;
		if(sum.hh>=24)
		{
			sum.hh=sum.hh%24;
		}
		return sum;
	}
	public Time subtract(Time a)
	{
		Time diff=new Time();
		diff.ss=ss-a.ss;
		int carry=0;
		while(diff.ss<0)
		{
			diff.ss+=60;
			carry-=1;
		}
		diff.mm=mm-a.mm+carry;
		carry=0;
		while(diff.mm<0)
		{
			diff.mm+=60;
			carry-=1;
		}
		diff.hh=hh-a.hh+carry;
		while(diff.hh<0)
			diff.hh+=24;
		return diff;
	}
	public void print()
	{
		System.out.print(hh+":"+mm+":"+ss);
	
	}
	public int compare(Time a)
	{
		int c=0;
		if(hh>a.hh)
			c=1;
		else if(hh<a.hh)
			c=-1;
		else
		{
			if(mm>a.mm)
				c=1;
			else if(mm<a.mm)
				c=-1;
			else
			{
				if(ss>a.ss)
					c=1;
				else if(ss<a.ss)
					c=-1;
				else 
					c=0;
			}
		}
		return c;
		
	}
}
