/* Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment4,Q15)---  Write a java program to print the below given pattern using 
                            while loop as well as for loop in two different programs. 
* * * * *
* * * * * 
* * * * *
* * * * *
    THIS IS THE FIRST PART(USING while loop) 
*/
package assignment4;

public class Question15_a 
{
	public static void main(String[] args) 
	{
        int i = 1;
        while (i<=20)
        {
        	System.out.print("* ");
        	if(i%5==0)
        	System.out.println();
        	i++;
        }
	}

}
