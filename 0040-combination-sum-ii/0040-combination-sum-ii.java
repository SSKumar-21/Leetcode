class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Set<List<Integer>> set  = new HashSet<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(candidates);
        solve(candidates, target, temp, set,0);
        return new ArrayList(set);
    }
    private void solve(int[] nums, int t, List<Integer> temp, Set<List<Integer>> set, int idx){
        if(idx >= nums.length){
            if(t == 0){
                set.add(new ArrayList(temp));
            }
            return ;
        }
        if (nums[idx] <= t){
            temp.add(nums[idx]);
            solve(nums, t - nums[idx] ,temp, set,idx + 1);
            temp.remove(temp.size() - 1);
            while(idx < nums.length - 1 && nums[idx] == nums[idx +1]) idx++;
        }
        solve(nums, t,temp, set,idx + 1);
    }
}