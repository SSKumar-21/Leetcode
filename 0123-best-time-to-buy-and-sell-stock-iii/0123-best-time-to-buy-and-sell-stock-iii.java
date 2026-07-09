class Solution {
    public int maxProfit(int[] p) {
        int n = p.length;
        int[][][] dp = new int[n+1][2][2];
        for(int[][] row : dp) for(int[] r:row) Arrays.fill(r, -1);
        return solve(p,0,1,0,dp);
    }
    private int solve(int[] p,int i, int b,int count,int[][][] dp){
        if(i >= p.length){
            return 0;
        }
        if(count >= 2 ){
            return 0;
        }
        if(dp[i][b][count] != -1){
            return dp[i][b][count];
        }
        int b1=0,b2=0,s1=0,s2=0;
        if (b == 1){
            b1 = solve(p,i+1,0,count,dp) - p[i];
        }
        b2 = solve(p,i+1,1,count,dp);

        if(b == 0){
            s1 = solve(p,i+1,1,count + 1,dp) + p[i];
            s2 = solve(p,i+1,0,count,dp);
        }
        

        return dp[i][b][count] = Math.max(
            Math.max(b1,b2),
            Math.max(s1,s2)
        );
    }
}