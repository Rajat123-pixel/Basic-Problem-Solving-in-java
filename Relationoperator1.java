 
package Lecture1;
import java.util.Scanner;

public class Relationoperator1 {

	public static void main(String[] args) {
		 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first element: ");
		int i = input.nextInt();
		System.out.println("Enter the second element: ");
		int j = input.nextInt();
		 
		boolean isEq = (i==j);
		boolean neq = (i != j);
		boolean isgr = (i > j);
		boolean isgreq = (i>=j);
		boolean isless = (i<j);
		boolean islesseq = (i<=j);
		System.out.println("Is Equal"+isEq);
		System.out.println("Is Not Equal"+neq);
		System.out.println("Is Greater Equal"+isgreq);
		System.out.println("Is Less"+isless);
		System.out.println("Is Less Equal"+islesseq);
	}
}
