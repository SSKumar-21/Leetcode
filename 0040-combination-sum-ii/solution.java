class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        HashSet<List<Integer>> res = new HashSet<>();
        List<Integer> temp = new ArrayList<>();
        Backtrack(candidates,0,temp,res,target);
        return new ArrayList<>(res);
    }
    private void Backtrack(int[] nums,int i,List<Integer> temp,HashSet<List<Integer>> res,int target){
        if (target == 0 ){
            res.add(new ArrayList(temp));
            return ;
        }

        if(target < 0 || i==nums.length){
            return ;
        }

        temp.add(nums[i]);
        Backtrack(nums,i+1,temp,res,target - nums[i]);
        temp.remove(temp.size()-1);
        
        int j=1+i;
        while(j<nums.length && nums[i]==nums[j]){
            j++;
        }

        Backtrack(nums,j,temp,res,target);
    }
}
