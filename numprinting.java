package javaargu;

public class numprinting {

	public static void main(String[] args) {
		 
		
		print(2);
	}
	
	static void print(int n) {
		
		if(n==6) {
			return;
		}
		System.out.println(n);
		print(n+1);
		
	}

}
