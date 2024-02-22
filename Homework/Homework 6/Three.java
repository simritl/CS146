package three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Three {

	
	public static List<List<Integer>> threeSum(int[] nums) {
		
		List<List<Integer>> triplets = new ArrayList<>();
		Arrays.sort(nums);
		
		if(nums.length < 3) {
			return triplets;
		}
		
		
		int i = 0;
		while (i < nums.length - 2) {
			if (i == 0 || nums[i] != nums[i - 1]) {
				int left = i + 1;
				int right = nums.length - 1;
				
				while (left < right) {
					int sum = nums[i] + nums[left] + nums[right];
					if (sum == 0 && !(i == 0 && nums[i] == 0 && nums[left] == 0 && nums[right] == 0)) {
						triplets.add(Arrays.asList(nums[i], nums[left], nums[right]));
						
						while (left < right && nums[right] == nums[right - 1]) {
							right--;
						}
						
						while (left < right && nums[left] == nums[left + 1]) {
							left++;
						}
						
						left++;
						right--;
					} else if (sum < 0) {
						left++;
					} else {
						right--;
					}
				}
			}
			i++;
		}
		
		return triplets;
	}
	
	public static void main(String[] args) {
		int nums[] = {-5,0,5,10,-10,0};
		System.out.print(threeSum(nums));
	}
}
