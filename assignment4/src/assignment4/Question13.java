/* Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment4,Q13)--- An integer n is divisible by 9 if the sum of its digits is divisible
 by 9. Write a java program to display each digit, starting with the rightmost digit. 
Your program should also determine whether or not the number is divisible by 9. Test it 
on the following numbers: 
n = 154368
n = 621594
n = 123456 
Hint: Use the % operator to get each digit; then use / to remove 
that digit. So 154368 % 10 gives 8 and 154368 / 10 gives 15436. 
The next digit extracted should be 6, then 3 and so on.
*/
package assignment4;
import java.util.*;
public class Question13 {

	public static void main(String[] args) 
	{
       Scanner sc = new Scanner (System.in);
       System.out.println("Enter number :");
       int n = sc.nextInt();
       int n1 = n;
       int sum=0,d=0;
       for(;n>0;n=n/10)
       {
    	  d = n%10;
    	  System.out.println(d);
    	  sum += d;
    	  sc.close();
       }
       if(sum%9 == 0)
         System.out.println("number "+ n1 +" is divisible by 9.");
       else
         System.out.println("number "+ n1 +" is not divisible by 9.");   
       //sc.close();
	}

}
