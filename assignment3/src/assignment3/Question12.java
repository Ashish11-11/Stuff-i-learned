/* Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment3,Q12)---Write a java program that prompts the user to enter three integers 
                                     and display the integers in non-decreasing order.
Here is a sample run:
Enter three integers: 2 4 3
Display the integers in non-decreasing order: 2 3 4       
example 2 3 3 
*/
package assignment3;
import java.util.*;
public class Question12 {

	public static void main(String[] args) 
	{
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter 3 integers :");
      int ia = sc.nextInt();
      int ib = sc.nextInt();
      int ic = sc.nextInt();
      if(ia<=ib)
      {
    	  if(ib<=ic)
    	  {
    		  System.out.println(ia+" "+ib+" "+ic);
    	  }
    	  else if(ia<=ic)
    	  {
    		  System.out.println(ia+" "+ic+" "+ib);
    	  }
    	  else
    	  {
    		  System.out.println(ic+" "+ia+" "+ib);
    	  }
      }
      else
      {
    	  if(ia<=ic)
    	  {
    		  System.out.println(ib +" "+ ia +" "+ ic);
    	  }
    	  else if(ic<=ib)
    	  {
    		  System.out.println(ic+" "+ib+" "+ia);
    	  }
    	  else
    	  {
    		  System.out.println(ib+" "+ic+" "+ia);
    	  }
      }
      
      sc.close();
      
	}

}
