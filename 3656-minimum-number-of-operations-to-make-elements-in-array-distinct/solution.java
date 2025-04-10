class Solution {
    public int minimumOperations(int[] nums) {
        int op=0,curr=0;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                op++;
                curr+=3;
                i=curr;
                set.clear();
                if(i<nums.length){
                    set.add(nums[i]);
                }
            } else {
                set.add(nums[i]);
            }
        }
        return op;
    }
}
