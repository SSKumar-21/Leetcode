class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        int i=0, j=nums.length -1;

        while(i<nums.length && nums[i]!=target) i++;
        while(j>=0 && nums[j]!=target) j--;

        if(i>j){
            res[0] = -1;
            res[1] = -1;
        } else {

        res[0] = i;
        res[1] = j;
        }
        return res;
    }
}
