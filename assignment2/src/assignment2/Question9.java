/* Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment2,Q9)---Write a java program that prompts the user to enter two points (x1, y1) and (x2, y2) and displays their 
distance between them. The formula for computing the distance is ((x2 - x1)^2 + (y2 - y1)^2)^(1/2).Note that you can use Math.pow (a, 0.5) to compute a^(1/2).
Here is a sample run:
Enter x1 and y1: 1.5 -3.4
Enter x2 and y2: 4 5
The distance between the two points is 8.764131445842194
*/
package assignment2;
import java.util.*;   // also import java.util.Scanner
public class Question9 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x1 and y1 :");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		System.out.println("Enter x2 and y2 :");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double distance = Math.pow( Math.pow(x2-x1,2) + Math.pow(y2-y1,2),0.5);   //Math.sqrt( Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
		System.out.println("The distance between the points is : " + distance);
		sc.close();
	}

}
