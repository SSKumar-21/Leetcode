class Solution:
    def numOfStrings(self, patterns: List[str], word: str) -> int:
        count = 0
        for ele in patterns:
            if ele in word:
                count = count + 1
        return count
        
