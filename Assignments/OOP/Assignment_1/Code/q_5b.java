class q_5b{

	public static void main(String args[]){
		
		int arr[][]=new int[][]{{1,2},{2,3}};

		Outer:
		for(int i=0; i <arr.length; i++){
			
			for(int j=0 ; j<arr[i].length;j++){
				
				if(arr[i][j] == 3)
					continue Outer;
				System.out.println("Element is " + arr[i][j]);
			}
		}
	}
}
