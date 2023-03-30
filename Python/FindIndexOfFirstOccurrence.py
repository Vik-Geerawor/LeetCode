class Solution:
    """
    Given two strings needle and haystack, return the index of the first 
    occurrence of needle in haystack, or -1 if needle is not part of haystack.
    """

    def strStr(self, haystack: str, needle: str) -> int:
        r = -1
        if needle in haystack:
            r = haystack.index(needle)

        return r


if __name__ == '__main__':
    haystack = "alleetocode"
    needle = "leeto"

    a = Solution()
    r = a.strStr(haystack, needle)
    print(r)
