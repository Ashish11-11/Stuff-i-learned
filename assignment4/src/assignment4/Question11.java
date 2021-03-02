/* Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment4,Q11)--- Write a java program to find the difference between the sum of 
the squares of the first one hundred natural numbers and the square of the sum.
The sum of the squares of the first ten natural numbers is, 
12 + 22 + ... + 102 = 385 
The square of the sum of the first ten natural numbers is, 
(1 + 2 + ... + 10)2 = 552 = 3025 
Hence the difference between the sum of the squares of the first ten natural numbers and the square 
of the sum is 3025 - 385 = 2640.
*/
package assignment4;

public class Question11 
{
	public static void main(String[] args) 
	{
        int sum1 = 0,sum2 = 0,diff = 0;
        for(int i = 1;i<=100;i++)
        {
        	sum1 += i*i;
        	sum2 += i;
        }
        sum2 = sum2*sum2;
                                           //  System.out.println(sum1+"    "+sum2);
        diff = Math.abs(sum1-sum2);
        System.out.println("difference is : "+diff);
	}

}
