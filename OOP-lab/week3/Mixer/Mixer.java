import java.util.*;
class Mixer
{
	private int a[];
	private int n;
	public void accept()
	{	
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter number of elements:");
		n=s.nextInt();
		a=new int[n];
		System.out.println("Enter unique elements in ascending order:");
		
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
			
		}
		
	}
	public void print()
	{
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
	}
	public Mixer merge(Mixer x)
	{
		Mixer merged = new Mixer();
		merged.a=new int[n+x.n];
		int i=0,j=0,k=0;
		for(;;k++)
		{
			if(i==n||j==x.n)
				break;
			else
			{
				if(a[i]<x.a[j])
				{
					merged.a[k]=a[i];
					i++;
				}
				else if(a[i]>x.a[j])
				{
					merged.a[k]=x.a[j];
					j++;
				}
				else
				{
					merged.a[k]=a[i];
					i++;
					j++;
				}
			}

		}
		while(i<n)
			merged.a[k++]=a[i++];
		while(j<x.n)
			merged.a[k++]=x.a[j++];
		merged.n=k;
		return merged;
	}
}
