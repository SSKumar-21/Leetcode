class Solution {
    public int minDistance(String a, String b) {
        int n = a.length();
        int m = b.length();

        int[][] dp = new int[n + 1][m + 1];
        for (int[] row : dp)
            Arrays.fill(row, -1);

        return solve(a, b, n, m, dp);
    }

    private int solve(String a, String b, int n, int m, int[][] dp) {
        if (n == 0 && m == 0) {
            return 0;
        }
        if (n == 0) {
            return m;
        }
        if (m == 0) {
            return n;
        }
        int res = 0;
        if (dp[n - 1][m - 1] != -1) {
            return dp[n - 1][m - 1];
        }
        if (a.charAt(n - 1) == b.charAt(m - 1)) {

            res = solve(a, b, n - 1, m - 1, dp);

        } else {

            int i = solve(a, b, n, m - 1, dp);
            int d = solve(a, b, n - 1, m, dp);
            int r = solve(a, b, n - 1, m - 1, dp);
            res = Math.min(i, d);
            res = Math.min(res, r) + 1;
        }
        return dp[n - 1][m - 1] = res;
    }
}