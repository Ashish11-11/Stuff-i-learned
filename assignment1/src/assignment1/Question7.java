/*Author's Name           :  Asish Kumar Sahoo
 *Author's Regd No.       :  2041019056
 *Author's Semester       :  1st
 *Author's Branch-Section :  CSE-24
 *Subject                 :  Introduction to Computer Programming (CSE 1001)
 *Problem Description     :  (Assignment1,Q7)--- To exchange the values of two variables of integer type A and B using 
                                                    third temporary variable C
 */
package assignment1;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int A=4,B=1,C=0;
        System.out.println("Before swapping:");
        System.out.println("Value of A="+A);
        System.out.println("Value of B="+B);
		C=A;
        A=B;
        B=C;
        System.out.println("\n");
        System.out.println("After swapping:");
        System.out.println("Value of A="+A);
        System.out.println("Value of B="+B);
	}

}
