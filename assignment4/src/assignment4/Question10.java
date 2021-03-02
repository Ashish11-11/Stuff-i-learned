/* Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment4,Q10)--- Write a java program to print the multiplication table 
                             of a number entered by the user.
*/
package assignment4;
import java.util.*;
public class Question10 
{
	public static void main(String[] args) 
	{
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number : ");
       int n = sc.nextInt();
       for(int i = 1; i<=10 ; i++)
       {
    	   System.out.println(n+" x "+i+"="+(n*i));
       }
       sc.close();
       
	}

}
