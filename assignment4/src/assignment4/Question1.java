/* Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment4,Q1)---  Write a java program to input a string message and 
                  display it 10 times in the following manner. Use a while loop.
*/
package assignment4;
import java.util.*;
public class Question1 
{
	public static void main(String[] args) 
	{
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a message :");
         String s1 = sc.next();
         int i1 = 1;
         while(i1<=10)
         {
        	 if(i1 == 1)
        		 System.out.println(i1+"st "+s1);
        	 else if(i1 == 2)
        		 System.out.println(i1+"nd "+s1);
        	 else if(i1 == 3)
        		 System.out.println(i1+"rd "+s1);
        	 else
        		 System.out.println(i1+"th "+s1); 
        	 i1++;
         }
         sc.close();
         
	}

}
