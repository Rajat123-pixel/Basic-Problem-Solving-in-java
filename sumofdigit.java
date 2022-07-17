package javaargu;

import java.util.Scanner;

public class sumofdigit {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter the value of n: ");
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		int ans = sum(n); 
		 
		 System.out.println(ans);

	}
	static int sum(int input) {
		
		if (input==0)  {
			return 0;
		}
		
		return(input%10) + sum(input/10);
		
	}

}
