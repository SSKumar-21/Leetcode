int climbStairs(int n) {
    if(n==1){
        return n;
    }
    int s1=1,s2=1,i,ans=0;
    for(i=1;i<n;i++){
        ans=s1+s2;
        s1=s2;
        s2=ans;
    }
    return ans;
}
