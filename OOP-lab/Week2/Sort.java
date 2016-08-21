import java.util.Scanner;

class Sort{

	public static void BubbleSort(int b[]){
		int siz= b.length;
		System.out.println(siz);
		//TO DO
		for(int i = 0; i<siz; i++){
			for(int j =0; j <siz-1; j++){
				int temp = 0;
				if(b[j]>b[j+1]){
					temp=b[j];
					b[j]=b[j+1];
					b[j+1]=temp;
				}
				
			} 
		}
		
		for(int i =0 ; i < siz; i++){
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
		System.out.println("The sorted array is ");
		BubbleSort(a);
	
	}

}
