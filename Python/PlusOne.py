class Solution:
    """
    You are given a large integer represented as an integer array digits, where 
    each digits[i] is the ith digit of the integer. The digits are ordered from 
    most significant to least significant in left-to-right order. The large 
    integer does not contain any leading 0's.

    Increment the large integer by one and return the resulting array of digits
    """

    def plusOne(self, digits: list[int]) -> list[int]:
        s = ''
        for digit in digits:
            s += str(digit)

        digits = str(int(s) + 1)
        digits = [int(x) for x in digits]

        return digits


if __name__ == '__main__':
    digits = [1239]

    a = Solution()
    r = a.plusOne(digits)
    print(r)
