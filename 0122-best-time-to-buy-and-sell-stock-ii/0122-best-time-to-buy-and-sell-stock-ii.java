class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][]dp = new int[n+1][2];
        for(int[] row: dp) Arrays.fill(row, -1);
        return solve(prices,0,1,dp);
    }
    private int solve(int[] p,int i, int b,int[][]dp){
        if(i >= p.length){
            return 0;
        }
        int b1=0,b2=0,s1=0,s2=0;
        if(dp[i][b]!= -1){
            return (dp[i][b]);
        }

        if (b == 1){
            b1 = solve(p,i+1,0,dp) - p[i];
        }
        b2 = solve(p,i+1,1,dp);

        if(b == 0){
            s1 = solve(p,i+1,1,dp) + p[i];
            s2 = solve(p,i+1,0,dp);
        }
        

        return dp[i][b] = Math.max(
            Math.max(b1,b2),
            Math.max(s1,s2)
        );
    }
}