from typing import List


class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        triplets = []

        for i in range(len(nums) - 2):
            if i == 0 or nums[i] != nums[i - 1]:
                left, right = i + 1, len(nums) - 1
                while left < right:
                    sum = nums[i] + nums[left] + nums[right]
                    if sum == 0:
                        triplets.append([nums[i], nums[left], nums[right]])
                        while left < right and nums[right] == nums[right - 1]:
                            right -= 1
                        while left < right and nums[left] == nums[left + 1]:
                            left += 1
                        left += 1
                        right -= 1
                    elif sum < 0:
                        left += 1
                    else:
                        right -= 1

        return triplets


# Test the function
nums = [-5, 0, 5, 10, -10, 0]
solution = Solution()
print(solution.threeSum(nums))
