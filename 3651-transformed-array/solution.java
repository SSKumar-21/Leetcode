class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                int index = i + nums[i];
                if(index >= nums.length){
                    index = index%nums.length ;
                }
                res[i] = nums[ index ];
            } else if (nums[i]<0){
                int index = i + nums[i];
                if(index < 0){
                    res[i] = nums[(((i + nums[i]) % nums.length) + nums.length) % nums.length]; ;
                } else {
                    res[i] = nums[index];
                }
            } else {
                res[i] = nums[i]; 
            }
        }
        return res;
    }
}
