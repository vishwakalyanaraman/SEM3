import java.util.Scanner;

interface Stack{
	void push(int x);
	void pop();
}

class FixedStack implements Stack{
	int top=-1;
	int stack[];
	FixedStack(int n){
	stack = new int[n];
	}

	public void push(int x){
		if(top==stack.length-1)
			System.out.println("Stack Overflow");
		else
			stack[++top]=x;
	}

	public void pop(){
		if(top==-1)
			System.out.println("Underflow");
		else
		System.out.println("Element deleted is "+stack[top--]);
	}

	public void display(){
		for(int i=0;i<=top;i++)
			System.out.print(stack[i]+" ");
	}

}

class DynamicStack implements Stack{
	int top=-1;
	int stack[];
	DynamicStack(int n){
		stack= new int[n];
	}

	public void push(int x){
		if(top==stack.length-1){
			System.out.println("Increasing Memory by twice");
			int temp[]=new int[stack.length*2];
			for(int i=0;i<stack.length;i++)
				temp[i]=stack[i];
			stack=temp;
		}
			stack[++top]=x;
	}

	public void pop(){
		if(top==-1)
			System.out.println("Underflow");
		else
		System.out.println("Element deleted is "+stack[top--]);
	}

	public void display(){
		for(int i=0;i<=top;i++)
			System.out.print(stack[i]+" ");
	}
}

class prg1{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter length of stack");
		int n=in.nextInt();
		FixedStack fs=new FixedStack(n);
		DynamicStack ds= new DynamicStack(n);

		int i=0,j=0,k=0,element;

		while(i!=3){
			System.out.println("\n1.FixedStack\n2.DynamicStack\n3.Exit");
			i=in.nextInt();
			switch(i)
			{
				case 1: while(j!=4){
						System.out.println("\n1.Push\n2.Pop\n3.Display\n4.Exit");
						j=in.nextInt();
						switch(j){
								  case 1: System.out.println("Enter element");
								  		element=in.nextInt();
								  		fs.push(element);
								  		break;
								  case 2: fs.pop();
								  		break;
								  case 3: fs.display();
								  default:;
								 }
						}
						break;
				case 2: while(k!=4){
						System.out.println("\n1.Push\n2.Pop\n3.Display\n4.Exit");
						k=in.nextInt();
						switch(k){
								  case 1: System.out.println("Enter element");
								  		element=in.nextInt();
								  		ds.push(element);
								  		break;
								  case 2: ds.pop();
								  		break;
								  case 3: ds.display();
								  default:;
								 }
						}
				default:;
			}
		}

	}
}