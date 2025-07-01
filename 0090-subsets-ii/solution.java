class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> res = new HashSet<>();
        List<Integer> temp = new ArrayList<>();
        return new ArrayList(backtrack(nums, temp, 0,res));
    }

    private static HashSet<List<Integer>> backtrack(int[] arr,List<Integer> temp,int i,HashSet<List<Integer>> res){
        if(i==arr.length){
            res.add(new ArrayList<>(temp));
            return res;
        }
        temp.add(arr[i]);
        backtrack(arr, temp, i+1,res);
        temp.remove(temp.size()-1);
        backtrack(arr, temp, i+1,res);

        return res;
    }
}
