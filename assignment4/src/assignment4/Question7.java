/* Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment4,Q7)--- Write a java program that takes an integer N as a command-line
               argument, uses Math.random() to print N uniform random values between 0 and 1, and then prints their 
                  average value.
*/
package assignment4;

public class Question7 
{
	public static void main(String[] args) 
	{
         int N = Integer.parseInt(args[0]);
         float sum = 0.0f, x = 0.0f;  // can also be done using double...no type casting req. for random function
         for(int i = 1;i<=N;i++)
         {
        	 x =(float) Math.random();
        	System.out.println(x);
        	sum += x;
         }
         System.out.println("Average is : "+sum/N);
	}

}
