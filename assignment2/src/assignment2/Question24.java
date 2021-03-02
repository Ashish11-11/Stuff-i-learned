/*Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment2,Q24)--Write a java program that prints five uniform random values between 0 and 1, their average 
                                   value, and their minimum and maximum value. Use Math.random(), Math.min(), and Math.max()
*/
package assignment2;

public class Question24 {

	public static void main(String[] args) 
	{
       double a = Math.random();
       double b = Math.random();
       double c = Math.random();
       double d = Math.random();
       double e = Math.random();
       double avg = (a+b+c+d+e)/5.0;
       double max = Math.max(a,Math.max(b,Math.max(c,Math.max(d, e))));
       double min = Math.min(a,Math.min(b,Math.min(c,Math.min(d, e))));
       System.out.println("Value 1 = " + a);
       System.out.println("Value 2 = " + b);
       System.out.println("Value 3 = " + c);       
       System.out.println("Value 4 = " + d);
       System.out.println("Value 5 = " + e);
       System.out.println("Average of the values = " + avg);
       System.out.println("Maximum value = " + max);
       System.out.println("Minimum value = " + min);
	}

}
