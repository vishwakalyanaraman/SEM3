import java.util.*;
public class oop_ass4_4
{
	public static void main(String[] args) {
		String str="pramod";
		char temp;
		char a[]=str.toCharArray();
		int len=a.length;
		for(int i=0;i<(len/2);i++)
		{
			temp=a[i];
			a[i]=a[len-i-1];
			a[len-i-1]=temp;
		}
		/*for(int i=0;i<len;i++)
			System.out.print(a[i]);*/
		String str2=String.valueOf(a);
		System.out.println(str2);

	
	}
}