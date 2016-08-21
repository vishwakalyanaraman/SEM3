import java.util.Scanner;

class InsDel{
	
	public static void InsertDelete(int b[]){
		int siz = b.length;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1 to Insert and 0 to Delete");
		int flag = sc.nextInt();
		// Insertion
		if(flag ==1){
			System.out.println("Insert Element:Enter number and position");
			int number = sc.nextInt();
			int position = sc.nextInt();
			int Iarr[]=new int[siz+1];
			//Copy all the elements till position into new array
			for(int i =0 ; i < position ; i++){
				Iarr[i]=b[i];
			}
			//Copy all the elements after position into new array
			for(int i = position +1 ; i < siz ; i++){
				Iarr[i]=b[i];
			}
			// insert number @ position in new array
			Iarr[position]=number;
			
			//Print the new array
			for(int i =0 ; i < siz+1; i++){
				System.out.print(Iarr[i]);
				System.out.print(" ");
			}
			 
		}
		// Deletion
		else if(flag ==0){
			System.out.println("Delete Element: Enter position");
			int posi = sc.nextInt();
			int Darr[]=new int[siz-1];
			//Copy all the elements till position into new array
			for(int i =0 ; i < posi -1; i++){
				Darr[i]=b[i];
			}
		
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
		
		InsertDelete(a);
	}
}
