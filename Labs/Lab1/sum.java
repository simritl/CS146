package lab1;

import java.util.Arrays;

public class Sum {
	
	private static int[] twoSum (int[] nums, int target){
		
		for (int i = 0; i < nums.length - 1; ++i ) {
			
			for (int j = i + 1; j < nums.length; ++j){
				
				if (nums[i] + nums[j] == target) {
					return new int[] {i, j};
				}
				
			}
			
			
		}
		
		return new int[] {}; 
		
	}
	
	public static void main (String[] args ) {
		int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int target = 17;
		
	
		System.out.print(Arrays.toString(twoSum(nums, target)));
	}
	

}






