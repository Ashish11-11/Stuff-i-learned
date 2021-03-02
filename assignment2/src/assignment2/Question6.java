/* Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment2,Q6)---Body Mass Index (BMI) is a measure of health on weight. It can be calculated by taking 
your weight in kilograms and dividing by the square of your height in meters. Write a java program that prompts the user to enter a weight in pounds and
height in inches and displays the BMI. 
Note that one pound is 0.45359237 kilograms and one inch is 0.0254 meters. 
                Here is a sample run:
                Enter weight in pounds: 95.5
                Enter height in inches: 50
                BMI is 26.8573
*/
package assignment2;
import java.util.*;   // also import java.util.Scanner 
public class Question6 {

	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);   //creating instance of scanner class
		 System.out.println("Enter weight in pounds :");
		 double weight = sc.nextDouble();           //weight = weight*0.45359237;   (for weight in kg)
		 System.out.println("Enter height in inches :");
		 double height = sc.nextDouble();           //height = height*0.0254;    (for height in metres)
		 double BMI = (weight*0.45359237) / (height*0.0254*height*0.0254);  // or can use this in denominator--> (Math.pow(height*0.0254, 2));
		 System.out.println("BMI is " +BMI);
		 sc.close();
	}

}
