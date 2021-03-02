/*Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment2,Q21)--Write a java program that takes a double value t from the command line and prints the value 
                                                    of sin (2t) + sin (3t).
*/
package assignment2;

public class Question21 
{
	public static void main(String[] args) 
	{
		double t = Double.parseDouble(args[0]);
        double rad = Math.toRadians(t);
        double res = Math.sin(2*rad) + Math.sin(3*rad);
        System.out.println("Result=" + res);

	}
	
}
//other way.....

/*   double t = Double.parseDouble(args[0]);
	 t=Math.toRadians(t);
	 double a=2*t,b=3*t;
	 double res= Math.sin(a) + Math.sin(b);
	 System.out.println("RESULT = "+ res);
*/
