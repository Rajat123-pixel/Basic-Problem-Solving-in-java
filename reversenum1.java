package javaargu;

public class reversenum1 {

	public static void main(String[] args) {
		
		fun(5);
	}
	static void fun(int n) {
		 if (n == 0) {
			 return ;
		 }
		 System.out.println(n);
		 fun(n-1);
	}
	
 
		 
		 
	static void print(int n) {
		
		if(n==6) {
			return;
		}
		System.out.println(n);
		print(n+1);
		
	}

}
	
