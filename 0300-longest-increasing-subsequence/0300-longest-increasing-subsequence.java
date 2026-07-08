class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length ;
        int dp[] = new int[n];
        dp[0] = 1;
        for(int i = 1;i<nums.length;i++){
            int max = dp[i];
            for(int j = i-1;j >= 0;j--){
                if(nums[j] < nums[i]){
                    max = Math.max(dp[j],max);
                }
            }
            dp[i] = 1 + max;
        }

        int max = Integer.MIN_VALUE;
        for(int ele : dp){
            max = Math.max(max, ele);
        }
        return max;
    }
}