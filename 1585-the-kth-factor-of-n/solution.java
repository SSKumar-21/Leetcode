class Solution {
    public int kthFactor(int n, int k) {
        int res = -1;
        for(int i = 1; i<=n; i++){
            if (n%i==0 && k>0){
                k--;
                res = i;
            } 
            if (k==0) break;
        }
        if (k!=0) return -1;
        return res;
    }
}
