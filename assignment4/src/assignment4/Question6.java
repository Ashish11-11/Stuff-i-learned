/* Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment4,Q6)--- Write a java program that, using one for loop and one if statement, 
               prints the integers from 1,000 to 2,000 with five integers per line. Hint: Use the % operation
*/
package assignment4;

public class Question6 
{
	public static void main(String[] args) 
	{
        int x = 1000;            //i=1;
		for(;x<=2000;x++)           //i++
		{
			System.out.print(x+" ");
			if(x%5==4)                 //i%5 == 0
				System.out.println();
		}
	}

}
