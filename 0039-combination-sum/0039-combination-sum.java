class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        solve(candidates, 0, target, temp, res);
        return res;
    }

    private void solve(int[] nums, int idx, int t, List<Integer> temp, List<List<Integer>> res){
        if(idx >= nums.length){
            if (0 == t) res.add(new ArrayList(temp));
            return;
        }

        if(t >= nums[idx] ){
            temp.add(nums[idx]);
            solve(nums,idx,t - nums[idx], temp,res);
            temp.remove(temp.size() - 1);
        } 
        solve(nums,idx+1,t, temp,res);
        
    }
}