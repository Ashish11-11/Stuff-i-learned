/*Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment2,Q18)--- . Write a java program that takes three double values x, y, and z as command-line
                                                 arguments and prints true if the values are strictly ascending or descending 
                                                 (x < y < z or x > y > z),and false otherwise.
*/
package assignment2;

public class Question18 
{
	public static void main(String[] args) 
	{
      double x = Double.parseDouble( args[0] );
      double y = Double.parseDouble( args[1] );
      double z = Double.parseDouble( args[2] );
      String res = ( x<y && y<z ) || ( x>y && y>z )?" true ":" false ";
      System.out.println(res);
	}

}
// line 19 - also by boolean res=( x<y && y<z ) || ( x>y && y>z );
// line 20 - System.out.println(res);
