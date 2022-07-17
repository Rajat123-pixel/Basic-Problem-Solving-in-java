package printingstars;

import java.util.Arrays;

public class mergesort1 {

	public static void main(String[] args) {
		 

	}
	static int[] mergeSort(int[], arr) {
		 if(arr.length == 1) {
			 return arr;
		 }
		 
		 int mid = arr.length/2;
		 
		 int[] left = mergeSort(Arrays.copyOfRange(arr,mid));
		 int[] right = mergeSort(Arrays.copyOfRange(mid,arr.length));
		 
		 return merge(left,right);

     }
	
	private static int[] merge(int[] first, int[] second) {
		int mix[] = new int[first.length + second.length];
	}


