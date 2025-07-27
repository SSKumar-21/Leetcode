class Solution {
    public int countHillValley(int[] nums) {
        int res =0;

        for(int i=1;i<nums.length-1;i++){
            if(nums[i] == nums[i-1]) continue;

            int x=i-1;
            int y=i+1;

            while(x>0 && nums[i]==nums[x]) x--;
            while(y<nums.length -1 && nums[i]==nums[y]) y++;



            if(nums[x]<nums[i] && nums[y]<nums[i]) res++;
            if(nums[x]>nums[i] && nums[y]>nums[i]) res++;
        }

        return res;
    }
}
