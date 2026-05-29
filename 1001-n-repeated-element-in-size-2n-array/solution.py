class Solution(object):
    def repeatedNTimes(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        for i in nums:
            if len(nums)/2 == nums.count(i):
                return i
        return -1
        
