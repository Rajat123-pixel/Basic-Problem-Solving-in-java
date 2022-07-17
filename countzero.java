package javaargu;

public class countzero {
	
	  

	public static void main(String[] args) {
		System.out.println(zeroCount(30204));
		
	}
	public static int zeroCount(int num)
	{
	    if(num == 0)
	       return 0;

	    if(num %10 ==0)
	        return 1 + zeroCount(num / 10);
	    else
	        return zeroCount(num/10); 
	}
	}
