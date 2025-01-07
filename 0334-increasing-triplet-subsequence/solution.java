class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length<3){
            return false;
        }
        int[] min=new int[nums.length];
        int[] max=new int[nums.length];
        int m=nums[0];
        for(int i=0;i<nums.length;i++){
            if(m>nums[i]){
                m=nums[i];
            }
            min[i]=m;
        }
        m=nums[nums.length-1];
        for(int i=nums.length-1;i>=0;i--){
            if(m<nums[i]){
                m=nums[i];
            }
            max[i]=m;
        }
        for(int i=0;i<nums.length;i++){
            if(min[i]<nums[i] && nums[i]<max[i]){
                return true;
            }
        }
        return false;
    }
}
