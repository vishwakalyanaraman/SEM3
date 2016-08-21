import java.util.Scanner;

class Reverse{

	public static void Reversing(int b[]){
		int siz= b.length;
		System.out.println("The reversed array is");
		for(int i = siz-1; i >=0; i--){
			System.out.println(b[i]);
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
		Reversing(a);
	
	}

}
