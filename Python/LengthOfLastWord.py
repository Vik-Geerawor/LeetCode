class Solution:
    """
    Given a string s consisting of words and spaces, return the length of the 
    last word in the string.
    """

    def lengthOfLastWord(self, s: str) -> int:
        s = s.strip()
        lst = s.split(' ')
        return len(lst[-1])


if __name__ == '__main__':
    s = "luffy is still joyboy"

    a = Solution()
    r = a.lengthOfLastWord(s)
    print(r)
