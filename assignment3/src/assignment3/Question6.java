/*Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment3,Q6)--- You can use Cramer’s rule to solve the following 2 X 2 system of linear equation:
 ax+by = e
 cx + dy = f

Write a java program that prompts the user to enter a, b, c, d, e, and f and displays the result. 
If ad - bc is 0, report that “The equation has no solution.”
Enter a, b, c, d, e, f: 9.0 4.0 3.0 -5.0 -6.0 -21.0
x is -2.0 and y is 3.0
Enter a, b, c, d, e, f: 1.0 2.0 2.0 4.0 4.0 5.0
The equation has no solution
*/
package assignment3;
import java.util.*;
public class Question6 {

	public static void main(String[] args) 
	{
	      Scanner sc = new Scanner(System.in); 
	      System.out.println("Enter a,b,c,d,e,f :");
	      double a = sc.nextDouble();
	      double b = sc.nextDouble();
	      double c = sc.nextDouble();
	      double d = sc.nextDouble();
	      double e = sc.nextDouble();
	      double f = sc.nextDouble();
	      if((a*d-b*c) !=0)
	      {
	    	double x = (e*d-b*f)/(a*d-b*c); 
	    	double y = (a*f-e*c)/(a*d-b*c);
	    	System.out.println("x is "+x+" and y is "+y);
	      }
	      else
	      {
	    	  System.out.println("The equation has no solution");
	      }
	      sc.close();
	}

}
