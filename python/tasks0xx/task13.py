class Solution:
    def __init__(self, ) -> None:
        self.mapping_rom_int = {
            'I': 1,
            'V': 5,
            'X': 10,
            'L': 50,
            'C': 100,
            'D': 500,
            'M': 1000
        }

    def romanToInt(self, s: str) -> int:

        if not s:
            return 0

        word_len = len(s)
        result = self.mapping_rom_int[s[word_len - 1]]

        for i in range(word_len - 1, 0, -1):
            current = self.mapping_rom_int[s[i]]
            prev = self.mapping_rom_int[s[i - 1]]

            if prev >= current:
                result += prev
            else:
                result -= prev
        return result


if __name__ == "__main__":
    solution = Solution()
    print(solution.romanToInt('III'))
    print(solution.romanToInt('LVIII'))
    print(solution.romanToInt('MCMXCIV'))
