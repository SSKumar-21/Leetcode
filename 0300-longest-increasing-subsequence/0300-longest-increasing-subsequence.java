class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n+1][n+1];
        for(int[] row: dp) Arrays.fill(row,-1);
        return solve(-1,0,nums,dp);
    }
    private int solve(int p, int i,int[] nums,int[][]dp){
        if(nums.length <= i){
            return 0;
        } 

        if(dp[p+1][i] != -1){
            return dp[p+1][i];
        }
        
        int l =0, r = 0;

        if(p == - 1 || nums[p] < nums[i]){
            l = 1 + solve(i,i+1,nums,dp);
        } 

        r = solve(p,i+1,nums,dp);
        return dp[p+1][i] = Math.max(l,r);
    }
}