import java.util.Scanner;


class Prime{
	
	public static int Isprime(int i){
	
		int j =1, check =2;
		for( j =2; j < i; j++){
			if( i % j ==0){
				check=1;
			}
		}
		return check;					
	}
	
	
	
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n= sc.nextInt();
		if(n <= 1){
		System.out.println("No prime number's available");
		}
		System.out.println("The prime number's are ... ");
		int i = 2;
		while(i <=n ){
			if (Isprime(i)== 2){
				System.out.println(i);
			}
			i=i+1;
		}		
	}
}
