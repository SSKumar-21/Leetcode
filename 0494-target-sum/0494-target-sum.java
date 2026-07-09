class Solution {
    public int findTargetSumWays(int[] nums, int target) {
         int sum = 0;
        for(int ele:nums) sum+=ele;
        if(sum < Math.abs(target) || (sum + target)%2!=0){
            return 0;
        }
        int t = (sum + target) / 2;
        int[][] dp = new int[nums.length][t + 1];
        for (int i = 0; i < nums.length; i++)  Arrays.fill(dp[i], -1);
        
        return solve(0 , t ,nums,dp);
    }

    private int solve(int i, int t, int[] nums,int[][] dp){
        if(i >= nums.length){
            if (t == 0) return 1;
            else return 0;
        } 
        if (dp[i][t] != -1) {
            return dp[i][t];
        }

        int l = 0,r = 0;
        if (nums[i] <= t){
            l = solve(i + 1, t - nums[i], nums,dp);
        }
        r = solve(i+1 ,t ,nums,dp);
        return dp[i][t] = l + r;
    }
}