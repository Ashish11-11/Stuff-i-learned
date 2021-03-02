/* Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment3,Q3)--- Input an integer through the keyboard. Write a java program to find out whether it is an 
                                              odd number or even number. 
*/
package assignment3;
import java.util.*;
public class Question3 {

	public static void main(String[] args) 
	{
	      Scanner sc = new Scanner(System.in); 
	      System.out.println("Enter an integer number :");
	      int n = sc.nextInt();
	      if(n%2==0)
	      {
	    	  System.out.println("Number "+n+" is an even number");
	      }
	      else
	      {
	    	  System.out.println("Number "+n+" is an odd number");
	      }
          sc.close();
	}

}
