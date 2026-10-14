class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length ; 
        int[] res = new int[n];
        int idx = 0;
        for(int i = 0; i < n ; i ++){
            if(nums[i] != 0 ) res[idx++] = nums[i];
        }
        for(int i = idx ;i<n;i++) res [i] = 0;
        for(int i = 0 ; i< n ; i++) nums[i] = res[i];
    }
}