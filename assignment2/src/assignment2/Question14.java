/*Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment2,Q14)--- To write a java program that takes two positive integers as command-line arguments
                                                        and prints true if either evenly divides the other.
*/
package assignment2;

public class Question14 
{
	public static void main(String[] args) 
	{
       int num1 = Integer.parseInt( args[0] );
       int num2 = Integer.parseInt( args[1] );
       String res = (num1 % num2 == 0 || num2 % num1 == 0 )? " true " : "  " ;
       System.out.println( res );
	}

}
