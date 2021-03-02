package assignment3;
import java.util.*;
public class Question7 {

	public static void main(String[] args) 
	{
	      Scanner sc = new Scanner(System.in); 
	      System.out.println("Enter x and y coordinates :");
	      double x = sc.nextDouble();
	      double y = sc.nextDouble();
	      if(y==0 && x!=0)
	      {
	    	  System.out.println("The point lies on X axis");
	      }
	      else if(x==0 && y!=0)
	      {
	    	  System.out.println("The point lies on Y axis");
	      }
	      else if(x>0 && y>0)
	      {
	    	  System.out.println("The point lies in first quadrant");  
	      }
	      else if(x<0 && y>0)
	      {
	    	  System.out.println("The point lies in second quadrant"); 
	      }
	      else if(x<0 && y<0)
	      {
	    	  System.out.println("The point lies in third quadrant");
	      }
	      else if(x>0 && y<0)
	      {
	    	  System.out.println("The point lies in fourth quadrant");
	      }
	      else 
	      {
	    	  System.out.println("The point lies on the origin");
	      }

	     sc.close();
	}

}
