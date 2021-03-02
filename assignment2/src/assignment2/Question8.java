/* Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment2,Q8)---Write a java program that displays the following table. Cast floating-point numbers into integers.
                               a   b    pow(a,b)
                               1   2       1
                               2   3       8
                               3   4       81
                               4   5       1024
                               5   6      15625
*/
package assignment2;

public class Question8 {

	public static void main(String[] args) 
	{
        float a = 1;
        System.out.println("a\tb\tpow(a,b)");
        System.out.println( (int)a +"\t"+ (int)(a+1) +"\t" +(int)Math.pow(a, ++a));
        System.out.println( (int)a +"\t"+ (int)(a+1) +"\t" +(int)Math.pow(a, ++a));
        System.out.println( (int)a +"\t"+ (int)(a+1) +"\t" +(int)Math.pow(a, ++a));
        System.out.println( (int)a +"\t"+ (int)(a+1) +"\t" +(int)Math.pow(a, ++a));
        System.out.println( (int)a +"\t"+ (int)(a+1) +"\t" +(int)Math.pow(a, ++a));
	}

}
