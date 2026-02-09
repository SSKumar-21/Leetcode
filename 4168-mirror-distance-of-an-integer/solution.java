class Solution {
    public int mirrorDistance(int n) {
        int a = n;
        int rev = 0;
        while (a!=0){
            rev = (10*rev) + (a%10);
            a /= 10;
        }
        return Math.abs(n - rev);
    }
}
