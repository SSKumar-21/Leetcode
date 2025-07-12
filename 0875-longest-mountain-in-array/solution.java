class Solution {
    public int longestMountain(int[] arr) {
        if(arr.length <3) return 0;
        int i=1;
        int res = 0;
        int l,r;
        while(i<arr.length -1){
            boolean peak = (arr[i]>arr[i+1]) && (arr[i]>arr[i-1]) ;
            if(peak){
                l = i;
                while(l-1>=0 && arr[l]>arr[l-1]) l-- ;
                r = i;
                while(r+1<arr.length && arr[r]>arr[r+1]) r++;
                res = Math.max(r-l+1,res);
                i = r;
            } else {
                i++;
            }
        }
        return res;
    }
}
