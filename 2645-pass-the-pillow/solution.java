class Solution {
    public int passThePillow(int n, int time) {
         int c=2*(n-1); 
        int t=time%c;

        if (t<n) {
            return 1+t;
        }else{
            return n-(t-(n-1));
        }
    }
}
