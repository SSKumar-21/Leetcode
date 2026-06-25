class Solution:
    def removeOccurrences(self, s: str, part: str) -> str:
        i =0
        while (i != -1):
            i = s.find(part)
            if (i==-1):
                break
            else:
                s = s[0:i] + s[i+len(part): ]
        return s

