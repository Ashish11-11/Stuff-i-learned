/* Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment2,Q11)---Write a java program that reads in investment amount, annual interest rate, and number of 
years, and displays the future investment value using the following formula:
futureInvestmentValue = investmentAmount x(1 + monthlyInterestRate)
number of years = 12
For example, if you enter amount 1000, annual interest rate 3.25%, and number of years 1, 
the future investment value is 1032.98.
Here is a sample run:
Enter investment amount: 1000.56
Enter annual interest rate in percentage: 4.25
Enter number of years: 1
Accumulated value is $1043.92
*/
package assignment2;
import java.util.*;   // also import java.util.Scanner
public class Question11 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter investment amount : ");
	    double invest = sc.nextDouble();
	    System.out.println("Enter annual interest rate : ");
	    double rate = sc.nextDouble();
	    System.out.println("Enter number of years : ");
	    double years = sc.nextDouble();
	    double fiv = invest*Math.pow((1 + rate/100/12),(years*12));   //divided by 12 for monthly interest rate
	    System.out.println("Accumulated value is " + fiv );
	    sc.close();
	}

}
