class Solution:
    """
    Given an integer array nums sorted in non-decreasing order, remove the 
    duplicates in-place such that each unique element appears only once. The 
    relative order of the elements should be kept the same.

    Since it is impossible to change the length of the array in some languages, 
    you must instead have the result be placed in the first part of the array 
    nums. More formally, if there are k elements after removing the duplicates, 
    then the first k elements of nums should hold the final result. It does not 
    matter what you leave beyond the first k elements.

    Return k after placing the final result in the first k slots of nums.
    """

    def removeDuplicates(self, nums: list[int]) -> int:
        is_equal = True
        for i in range(len(nums)):
            j = i + 1
            while is_equal:
                try:
                    if nums[i] == nums[j]:
                        nums.pop(j)
                    else:
                        break
                except IndexError:
                    is_equal = False
            if not is_equal:
                break

        print(nums, len(nums))


if __name__ == "__main__":

    lst = [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]
    a = Solution()

    r = a.removeDuplicates(lst)
    # print(r)
