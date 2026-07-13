class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        List<Integer> temp = new ArrayList<>();
        solve(nums, 0, temp, res , -1);
        return new ArrayList(res);
    }
    private void solve(int nums[], int idx, List<Integer> temp, Set<List<Integer>> res ,int prev) {
        if (idx >= nums.length) {
            if(temp.size() >= 2){
                res.add(new ArrayList(temp));
            }
            return;
        }
        if (prev == - 1 || nums[prev] <= nums[idx]){
            temp.add(nums[idx]); 
            solve(nums, idx + 1, temp, res , idx);
            temp.remove(temp.size() - 1);
        }
        // if( temp.size() > 0){
        //   temp.remove(temp.size() - 1);
        // }
         
        solve(nums, idx + 1, temp, res , prev);
        
    }
}