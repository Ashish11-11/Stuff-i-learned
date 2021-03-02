/* Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment4,Q16_A)---  Write the java programs to print the following four 
                         patterns using for loop using four different programs.
    *
    * *
    * * *
    * * * *
    * * * * *
*/
package assignment4;

public class Question16_A 
{
	public static void main(String[] args) 
	{
       for(int i = 1; i <= 5 ; i++)
       {
    	   for(int j = 1 ; j <= i ; j++)
    		   System.out.print("* ");
    	   System.out.println();
       }
	}

}
