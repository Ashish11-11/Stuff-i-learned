/* Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment2,Q13)---Write a java program that prompts the user to enter the minutes (e.g., 1 billion), and displays 
                                               the number of years and days for the minutes.For simplicity, assume a year has 365 days.
Here is a sample run:
Enter the number of minutes: 1000000000
1000000000 minutes is approximately 1902 years and 214 days
*/
package assignment2;
import java.util.*;   // also import java.util.Scanner
public class Question13 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number of minutes : ");
	    int min = sc.nextInt();
	    int year = min/(365*24*60);
	    int d = min%(365*24*60);
	    int days = d/(24*60);
	    System.out.println(min + " minutes is approximately "+ year +" years and "+ days+" days" );
	    sc.close();
	}

}
