class Solution {
    Map<Integer,Integer> map = new HashMap<>();
    public int rob(int[] nums) {
        int n = nums.length;
        return solve(nums,n-1);
    }
    private int solve(int[] nums, int idx){
        if(idx == 0) return nums[0];
        if(idx == 1) return Math.max(nums[1],nums[0]);
        if (map.containsKey(idx)){
            return map.get(idx);
        }
        int rob = nums[idx] + solve(nums, idx - 2);
        int notRob = solve(nums,idx - 1);
        int max = Math.max(rob,notRob);
        map.put(idx, max);
        return max;
    }
}