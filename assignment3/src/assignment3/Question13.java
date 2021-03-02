/* Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment3,Q13)---Write a java program that prompts the user to enter the month and year and displays the 
number of days in the month. For example, if the user entered month 2 and year 2012, the 
program should display that February 2012 had 29 days. If the user entered month 3 and 
year 2015, the program should display that March 2015 had 31 days. 
*/
package assignment3;
import java.util.*;
public class Question13 {

	public static void main(String[] args) 
	{
	       Scanner sc = new Scanner(System.in);
	       System.out.println("Enter the month :");
	       int iMonth = sc.nextInt();
	       System.out.println("Enter the year :");
	       int iYear = sc.nextInt();
	       String sMonth = null;
           int iD = 0;

	    	   switch(iMonth)
	   		{
	   		case 1 : sMonth = "January";
	   		         iD = 31;
	   		         break;
	   		
	   		case 2 :  sMonth = "February"; 
	   			   if((iYear % 4 == 0 && iYear % 100 != 0) || iYear % 400 == 0)
	   			        iD = 29;
	   			    else
	   			        iD = 28;
	   			    break;
	 
	   		case 3 : sMonth = "March";
		             iD = 31;
		             break;
		
	   		case 4 : sMonth = "April";
		             iD = 30;
		             break;
		
	   		case 5 : sMonth = "May";
		             iD = 31;
		             break;
		
	   		case 6 : sMonth = "June";
		             iD = 30;
		             break;
		
	   		case 7 : sMonth = "July";
		             iD = 31;
		             break;
		
	   		case 8 : sMonth = "August";
		             iD = 31;
		             break;
		
	   		case 9 : sMonth = "September";
		              iD = 30;
		              break;
		
	   		case 10 : sMonth = "October";
		              iD = 31;
		              break;
		
	   		case 11 : sMonth = "November";
		              iD = 30;
		              break;
		
	   		case 12 : sMonth = "December";
		              iD = 31;
		              break;
		    
		     default : System.out.println("Wrong choice entered");
		
	   		}   
	       		  
		System.out.println(sMonth +" "+iYear+" had "+ iD +" days.");
	      sc.close();      
	}
}


