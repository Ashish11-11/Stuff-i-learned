package assignment3;
import java.util.*;
public class Question8 {

	public static void main(String[] args) 
	{
	      Scanner sc = new Scanner(System.in); 
	      System.out.println("Enter three ages :");
	      int a = sc.nextInt();  //rahul
	      int b = sc.nextInt();  //ayush
	      int c = sc.nextInt();  //ajay
	      if(a>=0 && b>=0 && c>=0)
	      {
	      if(a>b)
	      {
	    	  if(a>c) 
	    	  {
	    		  System.out.println("rahul is elder");
	    	  }
	    	  else
	    	  {
	    		  System.out.println("ajay is elder");
	    	  }
	      }
	      else
	      {
	    	  if(b>c) 
	    	  {
	    		  System.out.println("ayush is elder");
	    	  }
	    	  else
	    	  {
	    		  System.out.println("ajay is elder");
	    	  }
	      }
	      }
	      else
	      {
	    	  System.out.println("enter valid age");
	      }
	      
	sc.close();
	}

}
