/* Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment2,Q4)---Write a java program that reads an integer between 0 and 1000 and adds all the digits in the integer.
                                       For example, if an integer is 932, the sum of all its digits is 14.
                                       Hint: Use the % operator to extract digits, and use the / operator to remove the extracted digit.
                                        For instance, 932 % 10 = 2 and 932 / 10 = 93.
                          Here is a sample run:
                         Enter a number between 0 and 1000: 999
                         The sum of the digits is 27
*/
package assignment2;
import java.util.*;   // also import java.util.Scanner 
public class Question4 {

	public static void main(String[] args) 
	{
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number between 0 to 1000");
       int a = sc.nextInt();
       int a1 = a;
       int sum = 0;
       sum += a%10;
       a /= 10;
       sum += a%10;
       a /= 10;
       sum += a%10;
       a /= 10;
       sum += a%10;
       a /= 10;
       System.out.println("Sum of the digits of the number "+ a1 + " is "+sum);
       sc.close();
    }

}
