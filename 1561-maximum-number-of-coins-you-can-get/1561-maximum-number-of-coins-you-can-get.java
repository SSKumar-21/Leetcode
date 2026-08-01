class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int res = 0;
        int i = 0;
        int j = piles.length - 1;
        while(i < j) {
            i++;
            j--;
            res += piles[j];
            j--;
        }
        return res;
    }
}