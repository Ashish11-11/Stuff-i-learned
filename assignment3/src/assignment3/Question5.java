/*Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment3,Q5)--- 
*/
package assignment3;
import java.util.*;
public class Question5 {

	public static void main(String[] args) 
	{
	      Scanner sc = new Scanner(System.in); 
	      System.out.println("Enter a,b,c :");
	      double a = sc.nextDouble();
	      double b = sc.nextDouble();
	      double c = sc.nextDouble();
	      if(a!=0)
	      {
	          double d = (b*b)-(4*a*c);
	          if (d>0)
	         {
	    	     double r1 = (-b+Math.pow(d, 0.5))/(2*a);
	    	     double r2 = (-b-Math.pow(d, 0.5))/(2*a);
	    	     System.out.println("The equation has two roots "+r1+" and "+r2);
	         }
	          
	           else if(d==0)
	         {
	    	     double r1 = -b/(2*a);
	    	     System.out.println("The equation has one root "+ r1);
	         }
	          
	           else
	         { 
	    	      System.out.println("The equation has no real roots");
	         }
	      }
	    else
	     {
	   	  System.out.println("The equation is not quadratic");
	     }
  sc.close();
  //System.exit(0);
	 }
	
	}
