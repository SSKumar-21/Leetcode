class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> res = new HashSet<>();
        return new ArrayList<>(Backtrack(nums,0,res));
    }

    private HashSet<List<Integer>> Backtrack (int[] nums,int i,HashSet<List<Integer>> res){
        if(i==nums.length){
            List<Integer> temp = new ArrayList<>();
            for(int ele : nums){
                temp.add(ele);
            }
            res.add(temp);
            return res;
        }
        for(int j=i;j<nums.length;j++){
            int x = nums[i];
            nums[i] = nums[j];
            nums[j] = x;

            Backtrack(nums,i+1,res);

            x = nums[i];
            nums[i] = nums[j];
            nums[j] = x;

        }
        return res;
    }
}
