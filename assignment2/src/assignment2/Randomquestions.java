package assignment2;

public class Randomquestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create random number between 0-1
		/*double num1=Math.random();
		System.out.println(num1);
//generate random number between 0-n let n =50
		double num2=Math.random();
		System.out.println(num2*50);
		//generate a random number between min and max
		int min=10,max=50;
		double num3=min+Math.random()*(max-min);
		System.out.println(num3);
		//Generate a random integer number between min and max both inclusive(lower limit constant)
		int num4=min+(int) (Math.random()*(max-min+1));
		System.out.println(num4);*/
int num1=Integer.parseInt(args[0]);//num1 is lower limit
int num2=Integer.parseInt(args[1]);//num2 is upper limit
int ranint= num1+(int) (Math.random()*(num2-num1));
System.out.println(ranint);
	}

}	