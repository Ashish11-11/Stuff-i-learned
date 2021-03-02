/* Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment2,Q2)---Write a java program that reads in the radius and length of a cylinder and computes the area 
                                   and volume using the following formulas:
                                                                               area = radius * radius * 22/7
                                                                               volume = area * length
                                                     Here is a sample run:
                                                                 Enter the radius and length of a cylinder: 5.5 12
                                                                  The area is 95.0331
                                                                  The volume is 1140.4 
*/
package assignment2;
import java.util.*;     // also java.util.Scanner;
public class Question2 {

	public static void main(String[] args) 
	{
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the radius and length of the cylinder : ");
       double rad = sc.nextDouble();
       double length = sc.nextDouble();
       double area = rad * rad *(22.0/7.0);    //3.1415;
       double vol = area * length;
       System.out.println("The area of the cylinder is: " + area);
       System.out.println("The volume of the cylinder is: " + vol);
       sc.close();
	}

}
