class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0,res=0,c=0;
        for(int i=0;i<nums.length;i++){
            c=c+nums[i];
            while(c+k < i-l+1){
                c=c-nums[l];
                l++;
            }
            res=Math.max(res,i-l+1);
        }
        return res;
    }
}
