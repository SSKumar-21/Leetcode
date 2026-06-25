class Solution:
    def minLength(self, s: str) -> int:
        while True :
            if "AB" in s:
                s = s.replace("AB", "", 1)
            elif "CD" in s:
                s = s.replace("CD", "", 1)
            else:
                break
        return len(s)
