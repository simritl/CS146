package hw2;

public class Bad {
	
	public static boolean isBadVersion(int x) {
		
		if (x >= 15) {
			return true;
		}
		return false;
		
	}
	
	public static int firstBadVersion(int n) {
		
		int start = 1; 
		int end = n; 
		int middle = 0;
		 
		
		while(start < end) {
			middle = start +(end - start)/2;
			
			
			if(isBadVersion(middle)) {
				 end = middle; 
	
				
			}
			else {
				start = middle +1;
			}
			
			
			
		}
		return start;
	
		
	}
	
	public static void main (String[] args) {
		int n = 20; 
		System.out.print(firstBadVersion(n));
		
	}
	
	
	
	
	
	
	
	

}
