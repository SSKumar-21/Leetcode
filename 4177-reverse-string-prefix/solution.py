class Solution(object):
    def reversePrefix(self, s, k):
        str = s[0:k]
        str = str[::-1]
        return str+s[k:]
        
