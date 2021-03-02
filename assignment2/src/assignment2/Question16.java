/*Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment2,Q16)--- Write a java program that prints the sum of two random integers between 1 and 6 (such as 
                                                      you might get when rolling dice).
*/
package assignment2;

public class Question16 {

	public static void main(String[] args) 
	{
		int min = Integer.parseInt(args[0]);   //lower limit=1
		int max = Integer.parseInt(args[1]);   //upper limit=6
		int rannum1 = min + (int) (Math.random()*(max-min+1));
		System.out.println(rannum1);
		int rannum2 = min + (int) (Math.random()*(max-min+1));
        System.out.println(rannum2);
		int sum = rannum1 + rannum2;
		System.out.println(sum);
	}

}
