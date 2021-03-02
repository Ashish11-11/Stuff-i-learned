/* Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment4,Q3)--- Write a java program that gets an integer from the user. Count from 0 to that number. Use 
                            a for loop to do it.
                    Count to: 20 
                  0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
*/
package assignment4;
import java.util.*;
public class Question3 
{
	public static void main(String[] args) 
	{
          Scanner sc = new Scanner(System.in);
          System.out.println("Count to :");
          int iN = sc.nextInt();
          for(int i = 0;i <= iN;i++)
          {
        	  System.out.print(i +" ");
          }
		  sc.close();
	}

}
