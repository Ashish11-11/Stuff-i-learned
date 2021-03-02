/* Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment3,Q1)--- Write a java program to input the height of the person and check if the height of the person 
                                                     is greater than or equal to 6 feet then print the message “The person is tall”.
*/
package assignment3;
import java.util.*;  //also use Scanner in place of *
public class Question1 {

	public static void main(String[] args) 
	{
      Scanner sc = new Scanner(System.in);  //
      System.out.println("Enter height of the person :");
      double height = sc.nextDouble();
      if (height >= 6.0)
      {
    	  System.out.println("The person is tall");
      }
      sc.close();
	}

}
