package assignment2;
import java.util.Scanner;//java.util is package,Scanner is the class
public class scannerinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        System.out.println("enter an integer number");
        int a=sc.nextInt();
        System.out.println("The integer number is " + a);
        System.out.println("Enter a float number");
        float b = sc.nextFloat();
        System.out.println("the floating point number is "+ b +" f");
        sc.close();
        
	}

}
