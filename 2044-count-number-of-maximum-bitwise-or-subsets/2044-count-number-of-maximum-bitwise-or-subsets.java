class Solution {
    int res = 0;
    int max = 0;
    public int countMaxOrSubsets(int[] nums) {
        for (int ele : nums) max = max | ele ;
        subset(0,0,nums);
        return res;
    }

    private void subset (int start, int curr, int[] nums){
        if (start == nums.length){
            if (max == curr){
                res++;
            }
            return ;
        }
        
        subset(start + 1, curr, nums);

        subset(start + 1,curr | nums[start],nums);
    }
}