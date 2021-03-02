/*Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment2,Q23)--Write a java program that takes three int values from the command line and prints them in 
                                                          ascending order. Use Math.min() and Math.max().
*/
package assignment2;

public class Question23 {

	public static void main(String[] args) 
	{
       int a = Integer.parseInt(args[0]);
       int b = Integer.parseInt(args[1]);
       int c = Integer.parseInt(args[2]);
       int max = Math.max(a,Math.max(b,c));
       int min = Math.min(a,Math.min(b,c));
       int mid = (a+b+c) - (max+min) ;
       System.out.println("in ascending order = " + min +" "+ mid +" "+ max);       
	}

}
