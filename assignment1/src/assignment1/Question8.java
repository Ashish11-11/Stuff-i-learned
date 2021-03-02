/*Author's Name           :  Asish Kumar Sahoo
 *Author's Regd No.       :  2041019056
 *Author's Semester       :  1st
 *Author's Branch-Section :  CSE-24
 *Subject                 :  Introduction to Computer Programming (CSE 1001)
 *Problem Description     :  (Assignment1,Q8)--- To exchange the values of two variables of integer type A and B without using 
                                                    third temporary variable
 */
package assignment1;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int A=4,B=1;
	        System.out.println("Before swapping:");
	        System.out.println("Value of A="+A);
	        System.out.println("Value of B="+B);
	        A=A+B;
	        B=A-B;
	        A=A-B;
	        System.out.println("\n");
	        System.out.println("After swapping:");
	        System.out.println("Value of A="+A);
	        System.out.println("Value of B="+B);
	}

}
