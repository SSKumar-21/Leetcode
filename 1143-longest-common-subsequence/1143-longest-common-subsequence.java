class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();

        int[][] dp = new int[n][m];
        for (int[] row : dp) Arrays.fill(row, -1);

        return solve(text1,text2,n ,m,dp);
    }

    private int solve(String a, String b, int n, int m,int[][] dp){
        if (n==0 || m==0){
            return 0;
        }

        if(dp[n-1][m-1] != -1){
            return dp[n-1][m-1];
        }

        char ach = a.charAt(n -1);
        char bch = b.charAt(m-1);

        if (ach == bch){
            return solve(a,b,n - 1,m -1, dp) + 1;
        } 

        return dp[n-1][m-1] = Math.max(solve(a,b,n-1,m,dp),solve(a,b,n,m-1,dp));
    }
}