package javaargu;

import java.util.Scanner;

public class ifelsehr1 {

	public static void main(String[] args) {
		 
		int num;
	    System.out.println("Enter an Integer number:");

	    //The input provided by user is stored in num
	    Scanner input = new Scanner(System.in);
	    num = input.nextInt();

	    /* If number is divisible by 2 then it's an even number
	     * else odd number*/
	    if ( num % 2 == 0 )
	        System.out.println("Not weird");
	     else
	        System.out.println("weird");

	}

}
