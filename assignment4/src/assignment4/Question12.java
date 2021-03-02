/* Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment4,Q12)--- Write a java program called FunctionGrowth that prints a table
of the values log N, N, N log N, N2, N3, and 2N for N = 16, 32, 64, ..., 2048. Use tabs (\t characters) to line up 
columns.
*/
package assignment4;

public class Question12 //class name should be FunctionGrowth
{
	public static void main(String[] args) 
	{
      int N=16;
      System.out.println("\tlog N"+"   "+"\tN"+"       "+"\tNlogN"+"         "+"\tN^2\t"+" "+"N^3\t"+"        "+"2N");
     // System.out.println("\t------"+"   "+"\t--"+"       "+"\t-------"+"     "+"\t----\t"+" "+"----\t"+"        "+"---");
      for(;N<=2048;N*=2)
      {
    	  System.out.print((float)(Math.log(N))+"\t");
    	  System.out.print(N+"\t");
    	  System.out.print((float)(N*(Math.log(N)))+"\t");
    	  System.out.print((int)(N*N)+"\t");
    	  System.out.print(" "+(int)(N*N*N)+"    "+"\t");
    	  System.out.print((int)(Math.pow(2,N)));
    	  System.out.println();
      }
	}

}
