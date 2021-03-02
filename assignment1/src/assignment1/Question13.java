 /*Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment1,Q13)--- To Print the given output using string concatenation. (extra string variables can be taken)
*/
package assignment1;

public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String ruler1="1 ";
        String ruler2="2 ";
		System.out.println(ruler1);
        System.out.println(ruler1+ruler2+ruler1);
        ruler1=ruler1+ruler2+ruler1;
        ruler2="3 ";
        System.out.println(ruler1+ruler2+ruler1);
        ruler1=ruler1+ruler2+ruler1;
        ruler2="4 ";
        System.out.println(ruler1+ruler2+ruler1);
	}

}
