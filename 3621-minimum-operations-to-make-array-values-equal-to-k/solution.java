class Solution {
    public int minOperations(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int min = nums[0];
        for(int i=0; i<nums.length ;i++){
            if(min>nums[i]){
                min=nums[i];
            }
            set.add(nums[i]);
        }
        if(min<k){
            return -1;
        }
        else if(min==k){
            return set.size() - 1;
        } else {
            return set.size();
        }
    }
}
