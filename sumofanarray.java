package Lecture1;

import java.util.Scanner;

public class sumofanarray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 
		int size= input.nextInt();
		 
		int myArray[] = new int [size];
	      int sum = 0;
	       
	      
	      for(int i=0; i<size; i++){
	          myArray[i] = input.nextInt();
	          sum = sum + myArray[i];
	       }
	      System.out.println(sum);
	}

}
