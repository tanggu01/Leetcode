class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        if not s:
            return t

        freq = defaultdict(int)
        for c in s:
            freq[c] += 1
        for c in t:
            if freq[c] == 0:
                return c
            freq[c] -= 1
        