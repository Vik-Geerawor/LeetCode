class Solution:
    """
    Given a sorted array of distinct integers and a target value, return the 
    index if the target is found. If not, return the index where it would be 
    if it were inserted in order.

    You must write an algorithm with O(log n) runtime complexity.
    """

    def searchInsert(self, nums: list[int], target: int) -> int:
        
        if target > nums[-1]:
            return len(nums)

        for num in nums:
            if num == target or num > target:
                r = nums.index(num)
                break
        
        return r


if __name__ == '__main__':
    nums = [1, 3, 5, 6]
    target = 7

    a = Solution()
    r = a.searchInsert(nums, target)
    print(r)
