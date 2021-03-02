/* Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment3,Q16)---  A University conducts a 100 mark exam for its student and grades them as follows. Assigns 
a grade based on the value of the marks. Write a java program to print the grade according 
to the mark secured by the student. [Use switch-case]
Mark Range       Letter Grade
>=90                 O
>=80 AND <90         A
>=70 AND <80         B
>=60 AND <70         C
>=50 AND <60         D
>=40 AND <50         E
<40 F
*/
package assignment3;
import java.util.*;
public class Question16 {

	public static void main(String[] args) 
	{
      Scanner sc  = new Scanner(System.in);
      System.out.println("Enter the marks :");
      int imarks = sc.nextInt();
      switch(imarks / 10)
      {
      case 10 : if (imarks == 100)
               
    	            System.out.println("Your GRADE is O");
                    else         
    	            System.out.println("Invalid input");
             break;                                        //also can you ternary operator in place of simple if statement.
      
      case 9 : System.out.println("Your GRADE is O");
              break;
      case 8 : System.out.println("Your GRADE is A");
              break;
      case 7 : System.out.println("Your GRADE is B");
              break;
      case 6 : System.out.println("Your GRADE is C");
              break;
      case 5 : System.out.println("Your GRADE is D");
              break;
      case 4 : System.out.println("Your GRADE is E");
              break;
      case 2 :  	  
      case 1 :     	  
      case 0 : 
      case 3 : System.out.println("Your GRADE is F");
              break;        
      default : System.out.println("Dont act smart.enter your correct marks within 100!!!");
              break;
    	  
      }
   	  sc.close();
      
	}

}
