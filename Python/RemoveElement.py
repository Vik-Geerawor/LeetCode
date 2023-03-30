class Solution:
    """
    Given an integer array 'nums' and an integer 'val', remove all occurrences of 
    val in nums in-place. The order of the elements may be changed. Then return 
    the number of elements in nums which are not equal to val.

    Consider the number of elements in nums which are not equal to val be k, 
    to get accepted, you need to do the following things:

    1. Change the array nums such that the first k elements of nums contain the 
    elements which are not equal to val. The remaining elements of nums are not 
    important as well as the size of nums.

    2. Return k.
    """

    def removeElement(self, nums: list[int], val: int) -> int:
        all_done = False

        i = 0
        while not all_done:
            try:
                if nums[i] == val:
                    nums.pop(i)
                else:
                    i += 1
            except IndexError as e:
                all_done = True

        return len(nums)


if __name__ == '__main__':
    nums = [0, 1, 2, 2, 3, 0, 4, 2]
    val = 2

    a = Solution()
    k = a.removeElement(nums, val)
    print(f"{k}, {nums}")
