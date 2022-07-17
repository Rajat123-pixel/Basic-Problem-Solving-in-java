package Lecture1;
import java.util.Scanner;

public class primechecking {

	public static void main(String[] args) {
		 
		int num, i, div=0;
	    System.out.println("Enter an Integer number:");

	    //The input provided by user is stored in num
	    Scanner input = new Scanner(System.in);
	    num = input.nextInt();
	    
	    for(i=2;i<num;i++)
	    {
	       if(num%i == 0)
	       {
	    	   div++;
	    	   break;
	       }
	    }
	    //div is divisor...if num is divided by any integer it will inside the loop and number of div change
	    // if div>0 means num has divisor then it is not prime otherwise prime..
	    if(div>0)
	    {
	    	System.out.println("The entered number is not prime");
	    }
	    else
	    {
	    	System.out.println("The entered number is prime");
	    }
	}

}
