/* Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment4,Q17)---  Write a java program to print the following pattern using 
                                                 nested loops.

*/
package assignment4;

public class Question17 
{
	public static void main(String[] args) 
	{
       int i =1,j=1;
       for(i=1 ; i<=10 ; i++)
       {
    	   int k =1;
    	   for(j=1 ; j<=10 ; j++,k++)
    	   {
    		   if(k%i == 0 || i%k == 0)
    		       System.out.print("* ");
    		   else
    			   System.out.print("  ");
    	   }
    	   System.out.println(i);
       }
	}

}
