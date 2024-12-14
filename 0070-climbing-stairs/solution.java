class Solution {
    public int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        int x=1,y=1,ans=x+y;
        for(int i=0;i<n-1;i++){
            ans=x+y;
            x=y;
            y=ans;
        }
        return ans;
}
}
