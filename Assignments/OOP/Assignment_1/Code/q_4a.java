class q_4a{
	int ans;
	
	//Default Constructor
	q_4a(){};

	//Parameterized Constructor
	q_4a(int num){
		ans=num;
	}

	//Copy Constructor
	q_4a(q_4a b){
		ans=b.ans;
	}

	public static void main(String args[]){
		//TO DO
		q_4a a = new q_4a(); //Default
		q_4a b =new q_4a(5); //Parameterized
		q_4a c = new q_4a(b); //Copy
	
		System.out.println("Default constructor : "+ a.ans );
		System.out.println("Parameterized : " + b.ans);
		System.out.println("Copy : " + c.ans);
	}
}
