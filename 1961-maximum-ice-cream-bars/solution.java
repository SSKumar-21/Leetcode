class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int n = costs.length;
        int res = 0;
        while(res < n && costs[res] <= coins) {
            coins -= costs[res];
            res += 1;
        }
        return res;
    }
}
