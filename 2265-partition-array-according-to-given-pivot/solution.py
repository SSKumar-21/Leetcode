class Solution:
    def pivotArray(self, nums: List[int], pivot: int) -> List[int]:
        res = []
        for i in nums:
            if pivot > i:
                res.append(i)
        for i in nums:
            if pivot == i:
                res.append(i)
        for i in nums:
            if pivot < i:
                res.append(i)
        return res
        
