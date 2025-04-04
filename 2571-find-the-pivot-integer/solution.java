class Solution {
    public int pivotInteger(int n) {
        if(n==1){
            return 1;
        }
        int l,r;
        for(int i=1;i<n;i++){
            l=i*(i+1)/2 ;
            r=( n*(n+1)/2 ) - l + i;
            if(r==l){
                return i;
            }
        }
        return -1;
    }
}
