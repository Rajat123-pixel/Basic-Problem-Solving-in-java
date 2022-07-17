package Lecture1;
import java.util.Scanner;

public class add2number {

	public static void main(String[] args) {
		 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first element: ");
		int i = input.nextInt();
		System.out.println("Enter the second element: ");
		int j = input.nextInt();
		System.out.println("sum of two numbers: ");
		int k = i+j;
		
		System.out.println(k);
	}

}
