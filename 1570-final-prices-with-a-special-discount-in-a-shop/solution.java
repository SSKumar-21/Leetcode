class Solution {
    public int[] finalPrices(int[] prices) {
        for(int i =0;i<prices.length ;i++){
            int dis = 0;
            for(int j =i+1;j<prices.length;j++){
                if(prices[i] >= prices[j]){
                    dis = prices[j];
                    break;
                }
            }
            prices[i] -= dis;
        }
        return prices;
    }
}
