class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        solve(0, temp, res, nums);
        return res;
    }
    private void solve(int idx, List<Integer> temp, List<List<Integer>> res,int[] nums){
        if(temp.size() == nums.length){
            res.add(new ArrayList(temp));
            return;
        }
        for(int i = 0 ;i<nums.length;i++){
            if (!temp.contains(nums[i])){
                temp.add(nums[i]);
                solve(idx , temp, res, nums);
                temp.remove(temp.size() - 1);
            }
        }
    }
}