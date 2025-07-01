class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> temp = new ArrayList<>();
        HashSet<List<Integer>> res = new HashSet<>();
        Backtrack(candidates, 0, temp, res, target);
        return new ArrayList<>(res);
    }

    private void Backtrack(int[] nums, int i, List<Integer> temp, HashSet<List<Integer>> res, int target) {
        if (target == 0) {
            List<Integer> copy = new ArrayList<>(temp);
            Collections.sort(copy); 
            res.add(copy);
            return;
        }

        if (target < 0 || i == nums.length){
            return;
        }

        temp.add(nums[i]);
        Backtrack(nums, i, temp, res, target - nums[i]);
        temp.remove(temp.size() - 1);

        Backtrack(nums, i + 1, temp, res, target);
    }
}

