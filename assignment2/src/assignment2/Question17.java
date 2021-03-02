 /*Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment2,Q17)--- To Write a java program that takes three positive integers as command-line 
                                        arguments and prints true if any one of them is greater than or equal to 
                                        the sum of the other two and false otherwise.
*/
package assignment2;

public class Question17 
{
	public static void main(String[] args) 
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		boolean res =  (a >=b + c) || ( b >=a + c) || ( c >=a + b);
		System.out.println(res);
	}

}
// line 19 - String s = ( a >=(b + c)) || ( b >=(a + c)) || ( c >=(a + b))  ? " true " : " false ";
// line 20 - System.out.println(s);