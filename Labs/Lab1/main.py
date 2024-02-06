def two_sum(nums, target):
    for i in range(len(nums) - 1):
        for j in range(i + 1, len(nums)):
            if nums[i] + nums[j] == target:
                return [i, j]
    return []

def main():
    nums = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    target = 17
    print(two_sum(nums, target))

if __name__ == "__main__":
    main()
