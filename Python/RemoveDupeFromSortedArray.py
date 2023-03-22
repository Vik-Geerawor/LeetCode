class Solution:
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
