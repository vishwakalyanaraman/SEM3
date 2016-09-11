import java.util.Scanner;

class Person
{
	private String name, dob;
	Person()
	{
		name=dob="\0";
	}
	Person(String n, String m)
	{
		name=n;	dob=m;
	}
	Person(Person p)
	{
		name=p.name; dob=p.dob;
	}
	
	void inputPerson()
	{
		Scanner sc=new Scanner(System.in);
		int d,m,y;
		System.out.println("Name : ");name=sc.nextLine();
		do{
			System.out.println("Date of Birth [dd/mm/yyyy]: ");dob=sc.nextLine();
			d=Integer.parseInt(dob.substring(0, 1));
			m=Integer.parseInt(dob.substring(2,  3));
			y=Integer.parseInt(dob.substring(4, 7));
		}while(d>0 & m>0 & y>0 & d<=31 & m<=12);
	}
	void printPerson()
	{
		System.out.println("Name : " + name);
		System.out.println("Date of Birth : " + dob);
	}
	String giveName()
	{
		return name;
	}
	String giveDOB()
	{
		return dob;
	}
}

class CollegeGraduate extends Person
{
	private double GPA;
	private int gradYear;
	CollegeGraduate()
	{
		GPA=gradYear=0;
	}
	CollegeGraduate(double g, int y)
	{
		GPA=g; gradYear=y;
	}
	CollegeGraduate(CollegeGraduate grad)
	{
		GPA=grad.GPA; gradYear=grad.gradYear;
	}
	
	void inputCollege()
	{
		inputPerson();
		Scanner sc=new Scanner(System.in);
		System.out.println("GPA : ");GPA=sc.nextDouble();
		System.out.println("Year of Graduation : ");gradYear=sc.nextInt();
	}
	void printCollege()
	{
		printPerson();
		System.out.println("GPA : " + GPA);
		System.out.println("Year of Graduation : " + gradYear);
	}
	double giveGPA()
	{
		return GPA;
	}
	int givegradYear()
	{
		return gradYear;
	}
}

public class Person_Test
{
	public static void main(String[] args) 
	{
		Person p=new Person();
		p.inputPerson();
		p.printPerson();
		
		CollegeGraduate cg=new CollegeGraduate();
		cg.inputCollege();
		cg.printCollege();
	}
}
