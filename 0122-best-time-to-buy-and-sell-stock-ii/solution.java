class Solution {
    public int maxProfit(int[] nums) {
        int res = 0;
        for (int i=0;i<nums.length-1;i++){
            int sub = nums[1+i] - nums[i];
            if (sub>0) res += sub;
        }
        return res;
    }
}
