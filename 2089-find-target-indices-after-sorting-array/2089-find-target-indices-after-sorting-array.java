class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int n = nums.length;
        int[] sort = new int[101];

        for (int i = 0; i < n; i++) {
            sort[nums[i]]++;
        }
        int count = 0;
        int idx = -1;
        for (int i = 0; i < 101; i++) {
            if (i == target) {
                count = sort[i];
                break;
            } else {
                idx += sort[i];
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