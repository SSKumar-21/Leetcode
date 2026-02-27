class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int l = 0;
        int r = 0;
        left[0]=0;
        for(int i=1;i<nums.length;i++){
            l += nums[i-1];
            left[i]=l;
        }
        right[nums.length - 1] = 0;
        for(int i =nums.length-2;i>=0;i--){
            r+=nums[i+1];
            right[i] = r;
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=Math.abs(left[i] - right[i]);
        }
        return nums;
    }
}
