class Solution(object):
    def twoSum(self, nums, target):
        """
        Description: Given an array of integers nums and an integer target, return
        indices of the two numbers such that they add up to target.
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """

        i = 0
        while i < len(nums):
            j = i + 1
            while j < len(nums):
                if nums[i] + nums[j] == target:
                    return [i, j]
                j += 1
            i += 1


if __name__ == '__main__':
    nums = [2, 7, 11, 15]
    target = 9
    a = Solution()
    b = a.twoSum(nums, target)
    print(b)