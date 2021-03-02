/* Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment2,Q10)---Write a java program that prompts the user to enter three points (x1, y1), (x2, y2), (x3, y3) 
                 of a triangle and displays its area. The formula for computing the area of a triangle is s = (side1 + side2 + side3)/2;
              area = (s * (s - a) * (s - b) * (s - c))^(1/2)
    Here is a sample run:
    Enter three points for a triangle: 1.5 -3.4 4.6 5 9.5 -3.4
    The area of the triangle is 33.6
*/
package assignment2;
import java.util.*;   // also import java.util.Scanner
public class Question10 
{
	public static void main(String[] args) 
	{
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter three points for a triangle : ");
      double x1 = sc.nextDouble();
      double y1 = sc.nextDouble();
      double x2 = sc.nextDouble();
      double y2 = sc.nextDouble();
      double x3 = sc.nextDouble();
      double y3 = sc.nextDouble();
      double a = Math.pow( (x2-x1)*(x2-x1) + (y2-y1)*(y2-y1),0.5);
      double b = Math.pow( (x3-x2)*(x3-x2) + (y3-y2)*(y3-y2),0.5);
      double c = Math.pow( (x3-x1)*(x3-x1) + (y3-y1)*(y3-y1),0.5);
      double s = (a + b + c)/2.0;
      double area = Math.pow(s * (s-a) * (s-b) * (s-c) , 0.5);
      System.out.println("The area of the triangle is : " + area);
      sc.close();
	}

}
