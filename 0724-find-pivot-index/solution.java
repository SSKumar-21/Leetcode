class Solution {
    public int pivotIndex(int[] nums) {
        int l=0,r=0,sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        r=sum-nums[0];
        for(int i=0;i<nums.length;i++){
            r=sum-l-nums[i];
            if(l==r){
                return i;
            }
            l+=nums[i];
        }
        return -1;
    }
}
