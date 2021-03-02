/* Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment2,Q1)--- Write a java program that reads a Celsius degree in a double value from the console,
                                    then converts it to Fahrenheit and displays the result. The formula for the conversion is as follows:
                             fahrenheit = (9 / 5) * celsius + 32
                             Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8.
                            
                             Here is a sample run:
                             Enter a degree in Celsius: 43
                             43 Celsius is 109.4 Fahrenheit
*/
package assignment2;
import java.util.Scanner;         // import java.util.* is the way of importing all the classes present in tha package util
public class Question1 
{
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a degree in celcius: ");
        double celcius = sc.nextDouble();
        double F = (9.0/5) * celcius + 32;
        System.out.println(celcius + " celcius is " + F + " Fahrenheit");
        sc.close();
	}

}
