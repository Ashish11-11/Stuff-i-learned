/* Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment2,Q7)---Write a java program that prompts the user to enter the side of a hexagon and displays its 
                                  area. The formula for computing the area of a hexagon is Area = (3*(3)^(1/2)*x^2)/(2) where s is the length of a side. 
           Here is a sample run:
            Enter the side: 5.5
            The area of the hexagon is 78.5895
*/
package assignment2;
import java.util.*;   // also import java.util.Scanner
public class Question7 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter side of a hexagon :");
		 double s = sc.nextDouble();
		 double area = (3 * Math.sqrt(3.0)*s*s)/(2.0);
		 System.out.println("The area of the hexagon is :" + area);
		 sc.close();
	}

}
