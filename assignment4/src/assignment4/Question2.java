/* Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment4,Q2)--- Rewrite the above java program in such a way that takes the number of lines to print as a 
                                command-line argument. You may assume that the argument is less than 1000. 
     Hint: Use i % 10 and i % 100 to determine when to use st, nd, rd, or th for printing the ith Hello.
*/
package assignment4;

public class Question2 {

	public static void main(String[] args) 
	{
         String s1 = args[0];
         int num = Integer.parseInt(args[1]);  //assumed that number inputed is below 1000
         int i = 1;   // counter
         while(i<=num)
         {
        	 if( (i % 10 == 1) && ( i % 100 != 11 ) )
        		 System.out.println(i+"st "+s1);
        	 else if( (i % 10 == 2) && ( i % 100 != 12 ) )
        		 System.out.println(i+"nd "+s1);
        	 else if( (i % 10 == 3) && ( i % 100 != 13 ) )
        		 System.out.println(i+"rd "+s1);
        	 else 
        		 System.out.println(i+"th "+s1); 
        	 i++;
         }
	}

}
