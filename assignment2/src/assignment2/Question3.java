/* Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment2,Q3)---Write a java program that reads a number in feet, converts it to meters, and displays the 
                                                 result. One foot is 0.305 meter. 
                                                                       Here is a sample run:
                                                                                Enter a value for feet: 16.5
                                                                                 16.5 feet is 5.0325 meters
*/
package assignment2;
import java.util.*;    // also import.java.util.Scanner
public class Question3 
{
	public static void main(String[] args) 
	{
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a value for feet: ");
       double feet =  sc.nextDouble();
       double meters = feet * 0.305;
       System.out.println(feet + " feet is " + meters + " meters");
       sc.close();
	}

}
