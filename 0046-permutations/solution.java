class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        return backtrack(nums,0,res);
    }
    private List<List<Integer>> backtrack(int[] nums,int i,List<List<Integer>> res){
        if(i==nums.length){
            List<Integer> temp = new ArrayList<>();
            for(int ele: nums){
                temp.add(ele);
            }
            res.add(temp);
            return res;
        }
        for(int j=i;j<nums.length;j++){
            int x = nums[i];
            nums[i] = nums[j];
            nums[j] = x;

            backtrack(nums,i+1,res);
            
            x = nums[i];
            nums[i] = nums[j];
            nums[j] = x;
        }
        return res;
    }
}
