/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package q5;
import java.util.*;


/**
 *
 * @author priyankark
 */
/*
Write an application that displays a series of at least 10 student ID numbers (that you have

stored in an array) and asks the user to enter a test letter grade for thestudent. Create

anExceptionclass namedGradeExceptionthat contains astatic publicarray of valid grade

letters (‘A’, ‘B’, ‘C’, ‘D’, ‘F’,and‘I’),whichyoucanuseto determine whether a grade entered

from the application is valid. In your application, throw aGradeExceptionif the user does not

enter a valid letter grade. Catch the GradeExceptionand then display an appropriate message.

In addition, store an‘I’ (for Incomplete) for any student for whom an exception is caught. At

the end of the application, display all the student IDs and grades.
*/


class GradeException extends Exception{
    
    public static char arr[]={'A','B','C','D','I'};
    
    GradeException(String s)
    {
        super(s);
    }
    
    
}

public class java {

    /**
     * @param args the command line arguments
     */
    
    static void validate(char testGrade) throws GradeException
    {
        boolean flag=false;
            for(char tg:GradeException.arr)
                if(tg==testGrade)
                {
                    flag=true;
                    break;
                }
        if(!flag)
            throw new GradeException("Invalid Grade entered");
        
    }
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int ids[]=new int[10];
        char grades[]=new char[10];
        
        //Ask user to enter 10 user IDs
        for(int i=0;i<10;i++)
            ids[i]=sc.nextInt();
        
        //Temporary grade that will be used for testing
        
        char testGrade;
        boolean flag=false;
        
        //For each of those IDs, ask for the grade
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter the grade for the id"+ids[i]);
            testGrade=sc.next().charAt(0);
            flag=false;
            try{
                validate(testGrade);
            }
            catch(Exception e)
            {
                grades[i]='I';
                flag=true;
                System.out.println("Exception Caught:"+e);
                
            }
            finally{
                if(!flag)
                    grades[i]=testGrade;
            }
            
            
            
            
            
                
        }
        
        //Output
        int counter=0;
        for(int id:ids)
            System.out.println(id+" "+grades[counter++]);
            
            
            
      
    }
    
}

/* Output
1
2
3
4
5
6
7
8
9
10
Enter the grade for the id1
A
Enter the grade for the id2
B
Enter the grade for the id3
C
Enter the grade for the id4
I
Enter the grade for the id5
M
Exception Caught:q5.GradeException: Invalid Grade entered
Enter the grade for the id6
F
Exception Caught:q5.GradeException: Invalid Grade entered
Enter the grade for the id7
A
Enter the grade for the id8
B
Enter the grade for the id9
C
Enter the grade for the id10
I
1 A
2 B
3 C
4 I
5 I
6 I
7 A
8 B
9 C
10 I

*/