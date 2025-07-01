class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        return backtrack(nums,temp,0,res);
    }

    private List<List<Integer>> backtrack (int[] nums,List<Integer> temp,int i,List<List<Integer>> res){
        if(nums.length == i){
            res.add(new ArrayList<>(temp));
            return res;
        }
        temp.add(nums[i]);
        backtrack(nums,temp,i+1,res);
        temp.remove(temp.size() -1);
        backtrack(nums,temp,i+1,res);
        return res;
    }
}
