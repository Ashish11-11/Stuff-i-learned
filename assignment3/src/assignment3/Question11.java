/* Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment3,Q11)---The body mass index (BMI) is commonly used by health and nutrition professionals to 
estimate human body fat in populations. It is computed by taking the individual's weight 
(mass) in kilograms and dividing it by the square of their height in meters. i.e. 
Metric: BMI=Weight (kg)/ (height in meter)^2

       Write a java program by using some if statements to show the category for a given BMI.
    BMI Category
  1-less than 18.5 underweight 
  2-18.5 to 24.9 normal weight 
  3-25.0 to 29.9 overweight 
  4-30.0 or more obese
*/
package assignment3;
import java.util.*;
public class Question11 {

	public static void main(String[] args) 
	{
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter height in meters and weight in kilograms :");
      double dHeight = sc.nextDouble();
      double dWeight = sc.nextDouble();
      double dBMI = dWeight/(dHeight*dHeight);
      
      if( dBMI >0 && dBMI < 18.5 )
        {
    	  System.out.println("Underweight");
        }
      else if(dBMI >= 18.5 && dBMI <= 24.9 )
        {
    	  System.out.println("Normal weight"); 
        }
      else if(dBMI >=25.0 && dBMI <= 29.9)
        {
    	  System.out.println("Overweight");
        }
      else if( dBMI > 30.0)
        {
    	  System.out.println("Obese");
        }
      sc.close();
      
	}

}
 



/*char ch = 'A';
   ch =(char)((int)ch + 3);
   System.out.println(ch);*/