import java.util.Scanner;

class Patient
{
	String name;
	int age, hospNum;
	Patient()
	{
		name="\0";
		age=hospNum=0;
	}
	Patient(String n, int a, int h)
	{
		name=n; age=a; hospNum=h;
	}
	Patient(Patient p)
	{
		name=p.name;
		age=p.age; hospNum=p.hospNum;
	}
}

class InPatient extends Patient
{
	String depName, dateOfAdm, roomType;
	InPatient()
	{
		super();
		name="\0";
		age=hospNum=0;
	}
	InPatient(String n, int a, int h, String d, String dat, String r)
	{
		super(n, a, h);
		depName=d; dateOfAdm=dat; roomType=r;
	}
	InPatient(InPatient p)
	{
		name=p.name;
		age=p.age; hospNum=p.hospNum;
		depName=p.depName;
		dateOfAdm=p.dateOfAdm;
		roomType=p.roomType;
	}
}

class Billing extends InPatient
{
	String dateOfDis;
	Billing()
	{
		super();
		dateOfDis="\0";
	}
	Billing(String n, int a, int h, String d, String dat, String r, String dis)
	{
		super(n, a, h, d, dat, r);
		dateOfDis=dis;
	}
	Billing(Billing p)
	{
		name=p.name;
		age=p.age; hospNum=p.hospNum;
		depName=p.depName;
		dateOfAdm=p.dateOfAdm;
		roomType=p.roomType;
		dateOfDis=p.dateOfDis;
	}
	
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Name : ");name=sc.next();
		System.out.println("Age : ");age=sc.nextInt();
		System.out.println("Hospital No. : ");hospNum=sc.nextInt();
		System.out.println("Department Name : ");name=sc.next();
		System.out.println("Date of Admission [dd/mm/yyyy] : ");dateOfAdm=sc.next();
		System.out.println("Room Type : ");roomType=sc.next();
		System.out.println("Date of Discharge [dd/mm/yyyy] : ");dateOfDis=sc.next();
	}
	
	void print()
	{
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Hospital No. : " + hospNum);
		System.out.println("Department Name : " + name);
		System.out.println("Room Type : " + roomType);
		System.out.println("Date of Admission : " + dateOfAdm);
		System.out.println("Date of Discharge: " + dateOfDis);
	}
	
	double totalAmt()
	{
		double amt=0;
		
		int d=Integer.parseInt(dateOfDis.substring(0, 2))-
				Integer.parseInt(dateOfAdm.substring(0, 2));
		int m=Integer.parseInt(dateOfDis.substring(3, 5))-
				Integer.parseInt(dateOfAdm.substring(3, 5));
		int y=Integer.parseInt(dateOfDis.substring(6,10))-
				Integer.parseInt(dateOfAdm.substring(6, 10));
		d+=(m*30) + (y*12*30); 
		
		if(roomType.compareTo("Special")==0)
			amt=d * (1000+200);
		else if(roomType.compareTo("SemiSpecial")==0)
			amt=d * (500+100);
		else if(roomType.compareTo("General")==0)
			amt=d * (100+50);
		
		return amt;
	}
}

public class Patient_Test 
{
	public static void main(String[] args) 
	{
		Billing b=new Billing();
		b.input();
		System.out.println("Billing Ammount : Rs." + b.totalAmt());
		b.print();
	}
}
