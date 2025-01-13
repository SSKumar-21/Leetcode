class Solution {
    public int findMin(int[] nums) {
        int min=5000;
        for(int i=0;i<nums.length;i++){
            min=Math.min(nums[i],min);
        }
        return min;
    }
}
