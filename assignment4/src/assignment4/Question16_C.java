/* Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment4,Q16_C)---  Write the java programs to print the following four 
                         patterns using for loop using four different programs.
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5

*/
package assignment4;

public class Question16_C 
{
	public static void main(String[] args) 
	{
		for(int i = 1; i <= 5 ; i++)
	       {
	    	   for(int j = 1 ; j <= i ; j++)
	    	   {
	    		   System.out.print(i+" ");
	    	   }
	    	   System.out.println();
	       }
	}

}
