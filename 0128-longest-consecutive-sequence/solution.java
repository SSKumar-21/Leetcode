class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int max = 1;
        int c = 1;
        int r=1;
        while(r<nums.length){
            if(nums[r] == nums[r-1]){
                r++;
                continue;
            } else if(nums[r] == nums[r-1]+1) {
                c++;
            }
            else {
                c=1;
            }
            max = Math.max(max,c);
            r++;
            
        }
        return max;
    }
}
