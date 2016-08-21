import java.util.Scanner;

class Symmetric{

	public static void CheckSymmetric(int b[][]){
		int siz= b.length;
		int check =0;
		
		for(int i = 0; i <siz; i++){
			for(int j =0; j < siz; j++){
				if(b[i][j]!=b[j][i]){
					check =1;
				}
				
			}
		}
		if(check ==1){
			System.out.println("Not Symmetric");
		}
		else{
			System.out.println("Symmetric");
		}
	}
	
	public static void main(String args[]){
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows and columns");
		int r = sc.nextInt();
		int c = sc.nextInt();
		if ( r == c){
			System.out.println("Enter the Matrix");
			int a[][]= new int[r][c];
			for(int i =0; i < r; i++){
				for(int j=0; j < c; j++){
					a[i][j]=sc.nextInt();
				}
			}
			
			CheckSymmetric(a);	
		}
		else{	
			System.out.println("Not Symmetric");
		}
		
		
	
	}

}
