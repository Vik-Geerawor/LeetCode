class Solution(object):
    def isPalindrome(self, x):
        """
        Given an integer x, return true if x is a palindrome, and false otherwise.
        :type x: int
        :rtype: bool
        """
        if x >= 0:
            y = list(str(x))
            y = int(''.join([i for i in reversed(y)]))

            if x == y:
                return True

        return False


if __name__ == '__main__':
    a = Solution()
    print(a.isPalindrome(121))
