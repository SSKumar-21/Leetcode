class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        if (sum % 2 != 0) {
            return false;
        }

        int target = sum / 2;
        Boolean[][] dp = new Boolean[nums.length][target + 1];

        return solve(0, target, nums, dp);
    }

    private boolean solve(int i, int t, int[] nums, Boolean[][] dp) {
        if (t == 0) {
            return true;
        }

        if (i == nums.length || t < 0) {
            return false;
        }

        if (dp[i][t] != null) {
            return dp[i][t];
        }

        boolean take = solve(i + 1, t - nums[i], nums, dp);
        boolean skip = solve(i + 1, t, nums, dp);

        return dp[i][t] = take || skip;
    }
}