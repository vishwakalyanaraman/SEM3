import java.util.Scanner;

class q2
{

	public static void main(String args[])
	{
			String numb;
			Scanner sc=new Scanner(System.in);
			numb=sc.nextLine();
			int l=numb.length();
			int l2;
			if(l%3==0)
				l2=l+(l/3)-1;
			else
				l2=l+(l/3);
			char temp[]=new char[l2];
			int t1=l-1;
			int t2=l2-1;
			int ctr=0;
			while(t2>=0)
			{
				if(ctr==3)
				{
					temp[t2--]=',';
					ctr=0;
				}
				else
				{
					temp[t2--]=numb.charAt(t1--);
					ctr++;
				}
				
			}
			temp[0]=numb.charAt(0);

			System.out.println(temp);
	}

};
