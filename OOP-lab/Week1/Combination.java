import java.util.Scanner;


class Combination{
	
	public static int Fact(int i){
	
		int count =1;
		while(i>0){
			count= count*i;
			i=i-1;
		}
		return count;
	
	}
	
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of n");
		int n=sc.nextInt();
		System.out.println("Enter the value of r");
		int r=sc.nextInt();
		int ans =0;
		ans=Fact(n)/(Fact(r)*Fact(n-r));
		System.out.println("The value of nCr is " + ans);		
	}
}
