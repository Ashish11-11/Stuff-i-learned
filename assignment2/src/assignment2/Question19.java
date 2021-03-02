/*Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment2,Q19)--- Enter the basic salary of an employee of an organization through the 
                                          command prompt. His dearness allowance (DA) is 40% of basic salary, and house rent allowance
                                           (HRA) is 20% of basic salary. Write a java program to calculate his gross salary
*/
package assignment2;

public class Question19 
{
	public static void main(String[] args) 
	{
		double bsalary = Double.parseDouble( args[0] );
		double DA = 0.4 * bsalary;
		double HRA = 0.2 * bsalary;
		double gross = bsalary + DA + HRA;
		System.out.println("BASIC SALARY = " + bsalary);
		System.out.println("Dearness Allowance = " + DA);
		System.out.println("House Rent Allowance = " + HRA);
		System.out.println("GROSS PAY = " + gross);
	}

}
//can also do without using variables DA and HRA;also better to display all values like basic salary,DA,HRA AND gross like this