class NumArray {
    int[] nums;
    int[] sum;
    public NumArray(int[] nums) {
        this.nums = nums;
        this.sum = new int[nums.length];
        sum[0] = nums[0];
    for(int i = 1;i<nums.length;i++){
        sum[i] = sum[i-1] + nums[i];
    }
    }
    
    public int sumRange(int left, int right) {
        return sum[right] - ((left - 1 < 0)? 0 : sum[left - 1] );
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
