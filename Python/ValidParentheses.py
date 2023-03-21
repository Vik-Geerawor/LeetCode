import unittest

class Solution:
    """
    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
    determine if the input string is valid.

    An input string is valid if:
    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.
    Every close bracket has a corresponding open bracket of the same type.
    """
    def isValid(self, s: str) -> bool:
        valid_pairs = [('(', ')'), ('{', '}'), ('[', ']')]
        open_char = ['(', '{', '[']
        close_char = [')', '}', ']']

        s = list(s)

        if (len(s) % 2 == 1) or (s[0] in close_char) or (s[-1] in open_char):
            return False

        open_list = []
        for i in range(len(s)):
            if s[i] in open_char:
                open_list.append(s[i])
                continue
            elif s[i] in close_char:
                try:
                    if (open_list.pop(), s[i]) in valid_pairs:
                        continue
                    else:
                        return False
                except IndexError:
                    return False
            else:
                return False

        if not open_list:
            return True
        else:
            return False



