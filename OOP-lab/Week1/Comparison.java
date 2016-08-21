import java.util.Scanner;


class Comparision{
	
	public static int Large(int i,int j, int k){
	
		int largest = (i>j?(i>k?i:k):(j>k?j:k));
		return largest;
	
	}
	
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		System.out.println("Enter the Third number");
		int c=sc.nextInt();
		int ans =0;
		ans=Large(a,b,c);
		System.out.println("The largest number is " + ans);		
	}
}
