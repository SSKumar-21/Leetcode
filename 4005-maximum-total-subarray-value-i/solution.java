class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long max = Integer.MIN_VALUE;
        long min = Integer.MAX_VALUE;
        for(int ele : nums){
            max= Math.max(max, ele);
            min = Math.min(min,ele);
        }
        return (max - min) * k;
    }
}
