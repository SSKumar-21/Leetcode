class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n = items.length;
        int[]  gain = new int[n];

        for(int i=0;i<n;i++){
            int cnt = 1;
            for(int j=0;j<n;j++){
                if(i!=j && items[j][0] % items[i][0] == 0){
                    cnt++ ;
                }
            }
            gain[i] = cnt;
        }
        int[] dp = new int[budget + 1];
        for(int i = 0;i<n;i++){
            int cost = items[i][1];
            int[] ndp = dp.clone();
            for(int b = cost;b<=budget;b++){
                ndp[b] = Math.max(ndp[b],dp[b-cost]+gain[i]);
            }
            for(int b = cost;b<=budget;b++){
                ndp[b] = Math.max(ndp[b],ndp[b-cost] + 1);
            }
            dp = ndp;
        }
        int res = 0;
        for(int ele:dp){
            res = Math.max(res,ele);
        }
        return res;
    }
}
