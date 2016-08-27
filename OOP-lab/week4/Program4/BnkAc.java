import java.util.Scanner;

class BnkAc{
	private String name;
	private int ac_no;
	private String ac_type;
	private double balance;
	static private double roi = 0.07;
	
	//Default Constructor
	BnkAc(){}
	//Parameterized Constructor
	BnkAc(String nm, int no, String a_t, double blnc){
		name=nm;
		ac_no=no;
		ac_type=a_t;
		balance=blnc;
	}
	//Copy Construc
	BnkAc(BnkAc a){
		name=a.name;
		ac_no=a.ac_no;
		ac_type=a.ac_type;
		balance=a.balance;
	}
	//Display ROI
	static void d_roi(){
		System.out.println("Rate of Interest :" +roi);
	}
	void display(){
		System.out.println("Name :" + name +"\nAccount No:" +ac_no +"\nAccount Type:"+ac_type +"\nBalance:"+ balance);
	}
	void deposit(){
		double amount;
		System.out.println("Enter amount to deposit");
		Scanner sc = new Scanner(System.in);
		amount=sc.nextInt();
		if(amount >0){
			balance+=amount;
		}
		else{
			System.out.println("Invalid Entry");
		}
		
	}
	
	void widthdraw (){
		double amount;
		System.out.println("Enter amount to widthdraw");
		Scanner sc = new Scanner(System.in);
		amount=sc.nextInt();
		if ( balance < amount){
			System.out.println("Insufficient's Funds");
		}
		else{
			balance -=amount;
		}
	}
	public static void main(String args[]){
		BnkAc a = new BnkAc("Ray",12345678,"Deposit",25000);
		a.display();
		d_roi();
		a.deposit();
		a.display();
		a.widthdraw();
		a.display();
	}
}
