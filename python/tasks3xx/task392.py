class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        if not s:
            return True

        count = 0

        for i in t:
            if s[count] == i:
                count += 1
            if count == len(s):
                break

        return count == len(s)


if __name__ == "__main__":
    solution = Solution()
    print(solution.isSubsequence("abc","ahbgdc"))
    print(solution.isSubsequence("axc","ahbgdc"))
