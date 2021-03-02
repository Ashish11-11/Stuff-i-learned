/* Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment3,Q17)---Write a java program that prompts the user to enter an integer and determines whether it is 
divisible by 5 and 6, whether it is divisible by 5 or 6, and whether it is divisible by 5 or 6, 
but not both. 
Here is a sample run of this program:
Enter an integer: 10
Is 10 divisible by 5 and 6? false
Is 10 divisible by 5 or 6? true
Is 10 divisible by 5 or 6, but not both? True
*/
package assignment3;
import java.util.*;
public class Question17 {

	public static void main(String[] args) 
	{
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter an integer :");
      int a = sc.nextInt();
         
      System.out.print("Is "+a+" divisible by 5 and 6? ");
         if(a % 5==0 && a % 6==0)       
        	 System.out.println(" true");        
         else
        	 System.out.println(" false");
                  
      System.out.print("Is "+a+" divisible by 5 or 6? ");
         if(a % 5==0 || a % 6==0)
        	 System.out.println(" true");
         else
        	 System.out.println(" false");
                 
      System.out.print("Is "+a+" divisible by 5 or 6,but not both? ");
      if(( a % 5 == 0) ^ (a % 6 == 0))                           //(a % 5 == 0 && a % 6 == 0)||(a % 6 == 0 && a % 5 == 0))   //v1^v2
     	                                                     //v = ( a % 5!=0 && a % 6!=0);   //(a % 5==0 || a % 6==0 || ( a % 5!=0 && a % 6!=0));
     	 System.out.println("true");
      else 
    	  System.out.println("false");
         sc.close();
      
	}

}
