/* Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment3,Q10)---Write a java program that prompts the user to enter an integer for today’s day of the week 
         (Sunday is 0, Monday is 1… and Saturday is 6). Also prompt the user to enter the number 
         of days after today for a future day and display the future day of the week. 
 
  Here is a sample run:
Enter today's day: 1
Enter the number of days elapsed since today: 3
Today is Monday and the future day is Thursday
Enter today's day: 0
Enter the number of days elapsed since today: 31
Today is Sunday and the future day is Wednesday
*/
package assignment3;
import java.util.*;
public class Question10 {

	public static void main(String[] args) 
	{
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter today's day :");
       int iTDate = sc.nextInt();
       System.out.println("Enter the number of days elapsed since today :");
       int iFDate = sc.nextInt();
       int iE = (iTDate+iFDate)%7;
       String sTD = null;String sFD = null;
           switch (iTDate)
           {
             case 0 :sTD = "Sunday";
   		     break;
   		
   		     case 1 : sTD = "Monday";
   		     break;
   		
   		     case 2 : sTD = "Tuesday";
   		     break;
   		
   		     case 3 : sTD = "Wednesday";
   		     break;
   		
   		     case 4 : sTD = "Thursday";
   		     break;
   		
   		     case 5 : sTD = "Friday";
   	         break;
   		
   		     case 6 : sTD = "Saturday";
   		     break;

   		  }
           
       switch (iE)
       {
             case 0 : sFD = "Sunday";
		     break;
		
		     case 1 : sFD = "Monday";
		     break;
		
		     case 2 : sFD = "Tuesday";
		     break;
		
		     case 3 : sFD = "Wednesday";
		     break;
		
		     case 4 : sFD = "Thursday";
		     break;
		
		     case 5 : sFD = "Friday";
	         break;
		
		     case 6 : sFD = "Saturday";
		     break;

		     
		  }
       System.out.println("Today is "+ sTD +" and the future day is "+sFD);
       sc.close();
       
	}

}
