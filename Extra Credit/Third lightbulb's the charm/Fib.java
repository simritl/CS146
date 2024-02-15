package fib;

public class Fib {
	
	public static int fibNum(int n) {
		
		int first = 0; 
		int second = 1; 
		int next; 
		
		if(n == 0) {
			return first;
			
		}
		
		for (int i = 2; i <= n; ++i) {
			
			next = first + second; 
			first = second; 
			second = next; 
			
		}
		return second;
		
	}
	
	public static void main(String args[]) {
		
		int n = 11;
		System.out.print(fibNum(n));
		
	}
	
	

}