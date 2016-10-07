import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.*;

class Employee{
	String name;
	int age;
	double grossSalary;
	float takeHomeSalary;
	char grade;



	void input() throws IOException{
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Name");
			name = input.readLine();
			System.out.println("Enter Age");
			age = Integer.parseInt(input.readLine());
			System.out.println("Enter Gross Salary");
			grossSalary = Double.parseDouble(input.readLine());
			System.out.println("Enter Take Home Salary");
			takeHomeSalary = Float.parseFloat(input.readLine());
			System.out.println("Enter Grade");
			grade = input.readLine().charAt(0);
	}

	void display(){
		System.out.println("Name\t\t\t: "+name+"\nAge\t\t\t: "+age+"\nGross Salary\t\t: "+grossSalary+"\nTake Home Salary\t: "+takeHomeSalary+"\nGrade\t\t\t: "+grade);
	}
}

class prg2{
	public static void main(String[] args) throws IOException{
				BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
				Employee employee = new Employee();
				int i=0;
				while(i!=3)
				{
					System.out.println("\n1. Input\n2. Display\n3. Exit");
					i=Integer.parseInt(input.readLine());
					switch (i) {
						case 1:
							employee.input();
							break;
						case 2:
							employee.display();
						default:;	
						
					}
				}	
	}
}

