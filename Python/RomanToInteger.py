class Solution(object):
    def romanToInt(self, s):
        """
        Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M
        Symbol       Value
        I             1
        V             5
        X             10
        L             50
        C             100
        D             500
        M             1000
        Roman numerals are usually written largest to smallest from left to right. However,the
        numeral for four is not IIII. Instead, the number four is written as IV. Because the one
        is before the five we subtract it making four. The same principle applies to thenumber
        nine, which is written as IX. There are six instances where subtraction is used:

        I can be placed before V (5) and X (10) to make 4 and 9.
        X can be placed before L (50) and C (100) to make 40 and 90.
        C can be placed before D (500) and M (1000) to make 400 and 900.

        :type s: str
        :rtype: int
        """
        roman_base = {'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000}

        result = 0
        subtractions = 0
        for i in s:
            result += roman_base[i]

        if "IV" in s:
            subtractions += -2
        if "IX" in s:
            subtractions += -2
        if "XL" in s:
            subtractions += -20
        if "XC" in s:
            subtractions += -20
        if "CD" in s:
            subtractions += -200
        if "CM" in s:
            subtractions += -200

        result += subtractions
        return result


if __name__ == '__main__':
    s = 'III'
    a = Solution()
    r = a.romanToInt(s)
    print(f"Result: {r}")



