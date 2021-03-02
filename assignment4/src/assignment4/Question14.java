/* Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment4,Q14)--- Write a java program to print largest power of two less than 
                              or equal to N.
*/
package assignment4;
import java.util.*;
public class Question14 
{
	public static void main(String[] args) 
	{
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter number : ");
      int n = sc.nextInt();
      int i = 0;
      for( i = 0 ; Math.pow(2, i) <= n ; i++)    //   <----   semicolon here
      {
    	  sc.close();
      }
      System.out.println("Largest power of two less than or equal to "+n+" is : "+(i-1));
	}

}
