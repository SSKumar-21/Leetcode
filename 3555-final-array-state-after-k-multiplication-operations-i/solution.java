class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while(k!=0){
            int index = 0;
            int temp = nums[0];
            for(int i=0;i<nums.length;i++){
                if(temp>nums[i]){
                    temp = nums[i];
                    index = i;
                }
            }
            nums[index] *= multiplier;
            k--;
        }
        return nums;
    }
}
