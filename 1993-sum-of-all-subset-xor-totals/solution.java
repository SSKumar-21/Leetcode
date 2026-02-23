class Solution {
    public int subsetXORSum(int[] nums) {
        int res = 0;
        for(int i : nums) res = res | i;

        return res * (1<<(nums.length - 1));
    }
}
