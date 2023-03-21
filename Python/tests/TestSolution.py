import unittest
from Python.ValidParentheses import Solution


class TestSolution(unittest.TestCase):

    def test_isValid(self):
        a = Solution()
        self.assertEqual(a.isValid("()"), True)
        self.assertEqual(a.isValid("()[]{}"), True)
        self.assertEqual(a.isValid("(("), False)
        self.assertEqual(a.isValid("()))"), False)


unittest.main()
