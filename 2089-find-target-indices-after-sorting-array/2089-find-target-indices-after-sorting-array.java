class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int n = nums.length;
        int count = 0;
        int idx = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] == target) {
                count ++;
            } else if (nums[i] < target) {
                idx ++;
            }
        }
        List<Integer> res = new ArrayList<>();
        while (count != 0) {
            idx++;
            count--;
            res.add(idx);
        }
        return res;
    }
}