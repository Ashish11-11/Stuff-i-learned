/* Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment3,Q2)--- Write a java program to input the mark of a student and check if the student mark is greater 
                                                     than or equal to 40, then it generates the following message.
   “Congratulation! You have passed the exam.” 
   Otherwise the output message is 
   “Sorry! You have failed the exam.”
*/
package assignment3;
import java.util.*;
public class Question2 {

	public static void main(String[] args) 
	{
	      Scanner sc = new Scanner(System.in);  //creating instance of scanner class
	      System.out.println("Enter the marks of student :");
	      int iMarks = sc.nextInt();
	      if(iMarks >= 40)
	      {
	      System.out.println("Congratulations! You have passed the exam.");
	      }
	      else
	      {
	    	  System.out.println("Sorry! You have failed the exam.");
	      }
	      sc.close();
	}

}
