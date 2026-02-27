class Solution {
    public int[] transformArray(int[] nums) {
        int even = 0;
        int odd = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0) even++;
            else odd++;
        }

        int[] res = new int[nums.length];
        int i = 0;

        for(; i < even; i++){
            res[i] = 0;
        }

        for(; i < nums.length; i++){
            res[i] = 1;
        }

        return res;
    }
}
