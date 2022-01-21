class Solution:

    def isPalindrome(self, x: int) -> bool:
        if x >= 0:
            return str(x) == str(x)[::-1]
        else:
            return False


if __name__ == "__main__":
    solution = Solution()
    print(solution.isPalindrome(-123))
    print(solution.isPalindrome(123))
    print(solution.isPalindrome(121))
