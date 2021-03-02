/* Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment3,Q14)---Write a java program that plays the popular scissor-rock-paper game. (A scissor can cut a 
                                               paper, a rock can knock a scissor, and a paper can wrap a rock.) The program randomly 
                                           generates a number 0, 1, or 2 representing scissor, rock, and paper. The program prompts 
                                              the user to enter a number 0, 1, or 2 and displays a message indicating whether the user or 
                                          the computer wins, loses, or draws.
           Here are sample runs:
scissor (0), rock (1), paper (2): 1
The computer is scissor. You are rock. You won

scissor (0), rock (1), paper (2): 2
The computer is paper. You are paper too. It is a draw 
*/
package assignment3;
import java.util.*;
public class Question14 {

	public static void main(String[] args) 
	{
       Scanner sc = new Scanner(System.in);
          System.out.println("scissor (0), rock (1), paper (2) : ");
          int u = sc.nextInt();
          int c = (int) Math.random()*(2);
          String sC = null,sU = null;

          switch(u)
          {
          case 0 : sU = "scissor";
                    break;
          case 1 : sU = "rock";
                    break;
          case 2 :  sU = "paper";
                    break;
          default : System.out.println("please enter default value");          
          }
          
          switch(c)
          {
          case 0 : sC = "scissor";
                    break;
          case 1 : sC = "rock";
                    break;
          case 2 :  sC = "paper";
                    break;

          }
          
          if(u==c)
          {
        	  System.out.println("The computer is "+sC+".You are "+sU+" too.It is a draw");
          }
          
           if((u == 0 && c == 2)||(u == 1 && c == 0)||(u == 2 && c == 1) )
          {
        	  System.out.println("The computer is "+ sC +".You are "+ sU +".You won");
          }
           if ((c == 0 && u == 2)||(c == 1 && u == 0)||(c == 2 && u == 1))
          {
        	  System.out.println("The computer is "+ sC +".You are "+ sU +".Computer won");
          }
          sc.close();

//   System.out.println(c);     --- this line for checking what the computer has given as output from 0,1,2(no use now)
	}

}
