package hw1;

public class Palindrome {
	
	
	public static boolean isPalindrome(String s) {
		
		s.toLowerCase();
		s.replaceAll("[^a-zA-Z0-9]", "");
		
		String reverse = "";
		
		for (int i = s.length() - 1; i >= 0; --i) {
			
			reverse = reverse + s.charAt(i);
			
		}
		
		if (s.equals(reverse)) {
			return true;
		}
		
		
		
		return false;
	}
	
	
	public static void main (String[] args) {
		String s = "racecar";
		System.out.print(isPalindrome(s));
		
	}
	
	
	

}
