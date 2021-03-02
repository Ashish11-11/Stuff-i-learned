/* Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment3,Q18)--- Write a java program which displays an appropriate name for a person, using a combination 
of nested ifs and compound conditions. Ask the user for a gender, first name, last name and 
age. If the person is female and 20 or over, ask if she is married. If so, display "Mrs." in 
front of her name. If not, display "Ms." in front of her name. If the female is under 20, 
display her first and last name. If the person is male and 20 or over, display "Mr." in front 
of his name. Otherwise, display his first and last name. Note that asking a person if they 
are married should only be done if they are female and 20 or older, which means you will 
have a single if and else nested inside one of your if statements. Also, did you know that 
with an if statements (or else), the curly braces are optional when there is only one statement 
inside?
What is your gender (M or F): F 
First name: Gita 
Last name: Pattanayak 
Age: 32 
Are you married, Gita (y or n)? y 
Then I shall call you Mrs. Gita Pattanayak. 
What is your gender (M or F): F 
First name: Anjali 
Last name: Mishra 
Age: 48 
Are you married, Anjali(y or n)? n 
Then I shall call you Ms. Anjali.
What is your gender (M or F): M 
First name: Ashok 
Last name: Mohanty 
Age: 23 
Then I shall call you Mr. Ashok. 
What is your gender (M or F): M 
First name: Rahul 
Last name: Pati 
Age: 15 
Then I shall call you Rahul Pati
*/

package assignment3;
import java.util.*;
public class Question18 {

	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your gender (M or F) :");
        char cGender = sc.next().charAt(0);
        System.out.println("First Name :");
        String sFName = sc.next();
        System.out.println("Last Name :");
        String sLName = sc.next();
        System.out.println("Age : ");
        int iAge = sc.nextInt();
         if( cGender == 'F')
          {
        	  if(iAge >= 20)
        	  {
                  System.out.println("Are you married, "+ sFName +"(y or n)?");
        		  char sMstatus = sc.next().charAt(0);
        		  if(sMstatus == 'y')        				  
        			  System.out.println("Then i shall call you Mrs. "+ sFName +" "+sLName);        				  
        		  else if(sMstatus == 'n')
                      System.out.println("Then i shall call you Ms. "+ sFName +" "+sLName);         			         		          
        		  else        		  
        			  System.out.println("please provide choice y or n!");        		  

        	  }
        	  else        	 
                  System.out.println("Then i shall call you "+ sFName +" "+sLName);         	        	 
          }
         if( cGender == 'M')
         {
             if (iAge >= 20)            
            	 System.out.println("Then i shall call you Mr. "+ sFName +" "+sLName);             
             else             
            	 System.out.println("Then i shall call you "+ sFName +" "+sLName);             
         }
        	
          
        sc.close();
        
	}

}
