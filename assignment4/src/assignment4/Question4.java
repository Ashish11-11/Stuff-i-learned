/* Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment4,Q4)--- Write a java program that gets three integers from the user. 
Count from the first number to the second number in increments of the third number. Use a for loop to do it. 
   Count from: 4 
   Count to: 13 
   Count by: 3 
     4 7 10 13
*/
package assignment4;
import java.util.*;
public class Question4 
{
	public static void main(String[] args) 
	{
         Scanner sc = new Scanner (System.in);
         System.out.println("Count from :");
         int iFrom = sc.nextInt();
         System.out.println("Count to :");
         int iTo = sc.nextInt();
         System.out.println("Count by :");
         int iBy = sc.nextInt();
                                                                                  //sc.close();
         for( ; iFrom <= iTo ; iFrom = iFrom + iBy)
         {
        	 System.out.print(iFrom+" ");
        	 sc.close();
         }
         // if i write sc.close() in this line its showing resource leak...but if i write within for loop at the 
         // end then no error
	}

}
