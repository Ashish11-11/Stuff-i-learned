/* Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment2,Q5)---Average acceleration is defined as the change of velocity divided by the time taken to make 
                                      the change, as shown in the following formula: a=(v1-v0)/t

Write a java program that prompts the user to enter the starting velocity v0 in meters/second, the ending velocity v1 in meters/second, and the time span t 
               in seconds, and displays the average acceleration.
Here is a sample run:
Enter v0, v1, and t: 5.5 50.9 4.5
The average acceleration is 10.0889
*/
package assignment2;
import java.util.*;   // also import java.util.Scanner 
public class Question5 {

	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter v0 ,v1 and t : ");
		 double v0 = sc.nextDouble();
		 double v1 = sc.nextDouble();
		 double t = sc.nextDouble();
		 double a = (v1-v0)/t;
		 System.out.println("The average acceleration is " + a);
		 sc.close();
	}

}
