class Solution {
    public int lastRemaining(int n) {
        return rec(n);
    }
    private int rec(int n){
        if(n == 1 || n==0) return 1;

        return 2 * (n/2 + 1 - rec(n/2));
    }
}
