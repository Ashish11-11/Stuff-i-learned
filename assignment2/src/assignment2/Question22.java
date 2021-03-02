/*Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment2,Q22)--. Write a java program that calculates the monthly payments you would have to make over 
                                                 a given number of years to pay off a loan at a given interest rate compounded continuously, 
                                                 taking the number of years t, the principal P, and the annual interest rate r as command-line 
                                                   arguments. The desired value is given by the formula Pe^(rt). Use Math.exp ().
*/
package assignment2;

public class Question22 
{
	public static void main(String[] args) 
	{
	  double P = Double.parseDouble(args[0]);
	  double t = Double.parseDouble(args[1]);
	  double r = Double.parseDouble(args[2]);
      double res = P*Math.exp(t*r);
      System.out.println("Principal amount = " + P);
      System.out.println("Time  = " + t);
      System.out.println("Rate of interest = " + r);
      System.out.println("Interest = " + res);
	}

}
