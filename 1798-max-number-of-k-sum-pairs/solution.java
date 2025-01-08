class Solution {
    public int maxOperations(int[] nums, int k) {
        int l=0,r=nums.length-1;
        int res=0;
        Arrays.sort(nums);
        while(l<r){
            if(nums[l]+nums[r]<k){
                l++;
            } else if(nums[l]+nums[r]>k){
                r--;
            } else {
                l++;
                r--;
                res++;
            }
        }
        return res;
    }
}
