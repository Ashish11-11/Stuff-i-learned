/* Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment4,Q16_D)---  Write the java programs to print the following four 
                         patterns using for loop using four different programs.
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

*/
package assignment4;

public class Question16_D 
{
	public static void main(String[] args) 
	{
		int n = 1;
		for(int i = 1; i <= 5 ; i++)
	       {
	    	   for(int j = 1 ; j <= i ; j++,n++)
	    	   {
	    		   System.out.print(n+" ");
	    	   }
	    	   System.out.println();
	       }
	}

}
