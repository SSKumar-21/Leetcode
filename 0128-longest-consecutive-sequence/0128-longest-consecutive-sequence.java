class Solution {
    public int longestConsecutive(int[] nums) {
        int res = 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);
        for(int ele : set){
            if (!set.contains(ele - 1)){
                int len = 0;
                while (set.contains(ele + len)) len++;
                res = Math.max(res,len);
            }
        }
        return res;
    }
}