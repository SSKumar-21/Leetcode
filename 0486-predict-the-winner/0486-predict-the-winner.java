class Solution {
    public boolean predictTheWinner(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        int p1 = solve(0, nums.length - 1, nums);
        int p2 = sum - p1;
        return p1 >= p2;
    }

    private int solve(int i, int j, int[] nums) {
        if (j < i) {
            return 0;
        }

        int l = nums[i] + Math.min(solve(i + 2, j, nums), solve(i + 1, j - 1, nums));
        int r = nums[j] + Math.min(solve(i, j - 2, nums), solve(i + 1, j - 1, nums));
        return Math.max(l, r);
    }
}