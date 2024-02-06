package lab2;
import java.util.Arrays;
public class Anagram {
	
	public static boolean isAnagram(String s, String t) {
		
		char [] sch = s.toCharArray();
		char [] tch = t.toCharArray();
		
		Arrays.sort(sch);
		Arrays.sort(tch);
		
		s = new String(sch);
		t = new String(tch);
		
		if (s.equals(t)) {
			return true;
			
		}
		return false;
		
		
	}
	
	public static void main (String[] args) {
		
		String s = "elbow";
		String t = "below";
		
		System.out.print(isAnagram(s, t));
	}
	

	
	

}
