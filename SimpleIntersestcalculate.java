
package Lecture1;
import java.util.Scanner;

public class SimpleIntersestcalculate {

	public static void main(String[] args) {
		
		int p, r, t, si;
		System.out.println("Enter the principle: ");
		Scanner input = new Scanner(System.in);
	    p = input.nextInt();
	    System.out.println("Enter the rate of Interest: ");
	    r = input.nextInt();
	    System.out.println("Enter the time: ");
	    t = input.nextInt();
	    si = (p*r*t)/100;
	    System.out.println("simple interest is: "+si);
		 

	}

}
