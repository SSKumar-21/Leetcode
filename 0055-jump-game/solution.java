class Solution {
    public boolean canJump(int[] nums) {
        int goal = nums.length - 1;

        for (int i = nums.length - 2; i >= 0; i--) {
            if (i + nums[i] >= goal) {
                goal = i;
            }
        }

        return goal == 0;      
    }
    // private boolean jump(int[] nums, int n, int i){
    //     if(i == n-1) return true;


    //     for(int j =1;j<=nums[i];j++){
    //         if(jump(nums,n,i+j)){
    //             return true;
    //         }
    //     }
    //     return false;
    // }
}
