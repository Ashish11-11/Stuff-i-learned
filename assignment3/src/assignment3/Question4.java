/*Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment3,Q3)--- Any character is entered through the keyboard, write a java program to determine whether 
the character entered is a capital letter, a small case letter, a digit or a special symbol. The 
following table shows the range of ASCII values for various characters.
Characters ASCII Values 
A – Z 65 – 90 
a – z 97 – 122 
0 – 9 48 – 57 
special symbols 0 - 47, 58 - 64, 91 - 96, 123 – 127
*/
package assignment3;
import java.util.*;
public class Question4 {

	public static void main(String[] args) 
	{
	      Scanner sc = new Scanner(System.in); 
	      System.out.println("Enter character :");
	      char ch = sc.next().charAt(0);
	      if(ch>=65 && ch<=90)                       //  65 - 90
	      {
	    	  System.out.println("Capital letter");  
	      }
	      else if(ch>=97 && ch<=122)                 //  97 - 122
	      {
	    	  System.out.println("SMALL letter");    //  0  -  47,  58  -  64,  91  -  96,  123  –  127 
	      }
	      else if(ch>=48 && ch<=57)                  //  48 - 57
	      {
	    	  System.out.println("numbers 0 - 9");
	      }
	      else if((ch>=0 && ch<=47)||(ch>=58 && ch<=64)||(ch>=91 && ch<=96)||(ch>=123 && ch<=127))   //  0  -  47,  58  -  64,  91  -  96,  123  –  127 
	      {
	    	  System.out.println("special symbols"); 
	      }
	      else
	      {
	    	  System.out.println("undefined character");
	      }
	      sc.close();
	}

}
