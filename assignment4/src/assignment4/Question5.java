/* Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment4,Q5)--- Write a java program that uses a for loop. With the loop, 
                            make the variable x go from -2 to 2, counting by 0.5. (This means that x can't be an int.) 
    -2.0
    -1.5
    -1.0
    -0.5
    0.0
    0.5
    1.0
    1.5
    2.0
*/
package assignment4;

public class Question5 
{
	public static void main(String[] args) 
	{
		double x = -2.0;          // also can go with float
        for(;x<=2.0;x+=0.5)            // no error even if we again write x=-2.0 but error of duplicate local...
         System.out.println(x);        //...variable if we write double x =  -2.0(both in the initialisation block)
	}

}
