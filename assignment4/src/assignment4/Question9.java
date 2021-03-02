/* Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment4,Q9)--- If we list all the natural numbers below 10 that are multiples of 
                                     3 or 5, we get 3, 5, 6 and 9.The sum of these multiples is 23. 
                Write a java program to find the sum of all the multiples of 3 or 5 below 1000.
*/
package assignment4;

public class Question9 
{
	public static void main(String[] args) 
	{
       int i = 1;
       int sum = 0;
       for(i = 1 ; i<1000 ; i++)
       {
    	   if(i%3 == 0 || i%5 == 0)
    	   {
    		   System.out.println(i);
    		   sum += i;
    	   }
       }
       System.out.println("Sum = "+sum);
	}

}
