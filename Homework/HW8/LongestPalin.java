package palindrome;
import java.util.HashSet;


public class LongestPalin {
	
	
	
	  public static int longestPalindrome(String s) {
		  
		  if(s == null || s.length() == 0) {
			  return 0;
			  
		  }
		  
		  
		  int evenCount = 0; 
		  
		  HashSet<Character> track = new  HashSet<Character>();
		  
		  for(int i = 0; i < s.length(); ++i) {
			  
			  if(track.contains(s.charAt(i))){
				  
				  track.remove(s.charAt(i));
				  evenCount ++;
				  
			  }
			  else {
				  
				  track.add(s.charAt(i));
				  
				  
			  }
			  
		  }
		  
		  if(track.isEmpty()) {
			  return 2 * evenCount;
			  
			  
		  }
		  else {
			  return 2 * evenCount + 1;
		  }
		  
		  

	    }
	  
	  
	  
	  public static void main (String[] args) {
		  
		  String s = "speediskey";
		  System.out.print(longestPalindrome(s));
		  
				
		  
		  
	  }
	
	
	
	
	

}
