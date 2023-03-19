class Solution:
    def longestCommonPrefix(self, strs: list[str]) -> str:
        # length of first string
        common_prefix = []
        x = len(strs[0])

        for j in range(0, x):
            letter = []
            try:
                for i in range(len(strs)):      # for each word
                    letter.append(strs[i][j])   # collect the letter at index j
            except IndexError as err:
                break
            letter = set(letter)                # do a distinct
            if len(letter) != 1:                # if not common letter
                break
            else:
                common_prefix.append(letter.pop())  # add to common_prefix

        return ''.join(common_prefix)


if __name__ == '__main__':
    # strs = ["flower", "flow", "flight"]
    strs = ["cir","car"]
    a = Solution()
    r = a.longestCommonPrefix(strs)
    print(r)



