/* Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment3,Q15)--- Write a java program that prompts the user to enter a point (x, y) and checks whether the 
point is within the circle centered at (0, 0) with radius 10. For example, (4, 5) is inside the 
circle and (9, 9) is outside the circle,
(Hint: A point is in the circle if its distance to (0, 0) is less than or equal to 10. The formula for 
computing the distance is sq root9(x2 - x1)2 + (y2 - y1)2) .Test your program to cover all cases.) 
Two sample runs are shown below.
Enter a point with two coordinates: 4 5
Point (4.0, 5.0) is in the circle
Enter a point with two coordinates: 9 9
Point (9.0, 9.0) is not in the circle
*/
package assignment3;
import java.util.*;
public class Question15 {

	public static void main(String[] args)
	{
       Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the point (x,y) :");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double d = Math.sqrt((x*x)+(y*y));
        if(d<=10)
        {
        	System.out.println("Point ("+x+","+y+") is in the circle.");
        }
        else
        {
        	System.out.println("Point ("+x+","+y+") is not in the circle.");
        }
       sc.close();	   
	}

}
