class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        if (target < 0) target *= -1;
        int sum = 0;
        for (int ele : nums)
            sum += ele;
        if (sum < Math.abs(target) || (sum + target) % 2 != 0) {
            return 0;
        }
        int tar = (sum + target) / 2;
        int n = nums.length;

        int[][] dp = new int[n + 1][tar + 1];
        dp[0][0] = 1;

        for (int i = 0; i <= n; i++) dp[i][0] = 1;
        
        for (int i = 1; i <= n; i++) {
            for (int t = 0; t <= tar; t++) {
                if (nums[i - 1] <= t) {
                    dp[i][t] = dp[i - 1][t - nums[i - 1]] + dp[i - 1][t];
                } else {
                    dp[i][t] = dp[i - 1][t];
                }
            }
        }

        return dp[n][tar];
    }
}