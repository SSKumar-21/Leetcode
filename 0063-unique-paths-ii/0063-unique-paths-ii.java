class Solution {
    public int uniquePathsWithObstacles(int[][] o) {
        int m = o.length;
        int n = o[0].length;
        int[][] dp = new int[m][n];
        for(int[] row: dp) Arrays.fill(row, -1);
        return solve(0, 0, m, n,dp, o);
    }
    private int solve(int i,int j, int m, int n, int[][] dp,int[][] o){
        if(i > m-1 || j > n - 1){
            return 0;
        }
        if(o[i][j] == 1){
            return 0;
        }
        if(i == m-1 && j == n-1){
            return 1;
        }
        
        
        int r, d;
        if(dp[i][j]!=-1){
            return dp[i][j];
        } 
        d = solve(i+1, j, m , n, dp,o);

        r = solve(i, j+1, m , n, dp,o);
        

        return dp[i][j] = d + r;
        
    }
}