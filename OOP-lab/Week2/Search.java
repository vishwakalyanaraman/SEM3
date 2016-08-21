import java.util.Scanner;

class Search{

	public static void LinearSearch(int b[],int a){
		int siz= b.length;
		int check =1;
		
		for(int i = 0; i <siz; i++){
			if(a== b[i]){
				System.out.println("Number found at " +(i+1) +" position");
				check =0;
			}
		}
		if(check ==1){
			System.out.println("Number not found");
		}
	}
	
	public static void main(String args[]){
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int n = sc.nextInt();
		System.out.println("Enter the array");
		int a[]= new int[n];
		for(int i =0; i < n; i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Enter number to be searched");
		int num = sc.nextInt();
		LinearSearch(a,num);
	
	}

}
