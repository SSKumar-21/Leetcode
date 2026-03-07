class Solution {
    public int hammingDistance(int x, int y) {
        int c = x^y;
        int res = 0;
        while (c!=0){
            res += (c&1);
            c = c>>1;
        }
        return res;
    }
}
