import java.util.Scanner;
public class Stack{
  private final int cap=4;
  int arr[]=new int[cap];
  int tos=-1;

   public void push(int pushEle)
     {
	   if(tos<cap-1)
         {
           tos++;
           arr[tos]=pushEle;
		   System.out.println("Element"+pushEle+"is pushed to stack.");
           displayEle();         
		}

      else
       {
        System.out.println("Stack is overflow.");
       }		
	}


    public void pop()
     {
      if(tos>=0)
       {
         tos--;
         System.out.println("Pop operation is done.");
		}
	  else
       {
        System.out.println("Stack is underflow.");
        }
	 }
    
    public void displayEle()
      {
        if(tos>=0)
         {
		  System.out.println("Elements in stack are:");
          for(int i=0;i<=tos;i++)
            {
             System.out.println(arr[i]);
			}
         }
		}
    
      public static void main(String[] args)
        {
         Stack obj=new Stack();
         obj.pop();
		 obj.push(23);
         obj.push(1);
         obj.push(21);
         obj.push(4);
         obj.pop();
         obj.displayEle();
		 obj.pop();
         obj.displayEle();     
          
    	}

 }
