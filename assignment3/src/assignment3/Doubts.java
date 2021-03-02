package assignment3;

public class Doubts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String x = args[0];
        String y = args[1];
        String z = args[2];
        System.out.println(x+y+z);
        float m = Float.parseFloat(args[3]);
        System.out.println(m);
        double  a= 3.0/0,b = 0/4.0 , c = 0/0.0;
        System.out.println(a+" "+b+" "+c);
        int r = 1;
        while(r<=6)
        {
        	System.out.println("iter");
        	++r;
        }
	}

}
