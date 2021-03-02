/* Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment4,Q8)--- Write a java program to print the following output using loop.
1
121
1213121
121312141213121
1213121412131215121312141213121
*/
package assignment4;

public class Question8 
{
	public static void main(String[] args) 
	{
       int i;
       String x ="";
       for(i = 1;i <= 5;i++)
       {  
    	        x = x + i + x; 
    		   System.out.print(x);     	  
    		   System.out.println();                   // x = Integer.toString(i);    //String.valueOf(i);  
       }
	}
}