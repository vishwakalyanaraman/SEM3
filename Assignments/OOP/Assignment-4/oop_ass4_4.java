import java.util.*;
public class oop_ass4_4
{
	static void reverse(String arr){
		char a[]=arr.toCharArray();
		char temp;
		int len = a.length;
		for(int i =0; i <(len/2);i++)
		{
			temp=a[i];
			a[i]=a[len-i-1];
			a[len-i-1]=temp;
		}
		String str2 = String.valueOf(a);
		System.out.println(str2);
	}
	public static void main(String[] args) {
		String str="pramod";
		reverse(str);

	
	}
}
