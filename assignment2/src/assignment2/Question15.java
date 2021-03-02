/*Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment2,Q15)--- Write a java program that takes two int values a and b from the command line and
                                                   prints a random integer between a and b.
*/
package assignment2;

public class Question15 
{
	public static void main(String[] args) 
	{
		int min = Integer.parseInt(args[0]);   //lower limit
		int max = Integer.parseInt(args[1]);   //upper limit
		int ranint = min + (int) (Math.random()*(max - min+1));
		System.out.println(ranint);
	}

}
