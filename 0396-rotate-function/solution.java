class Solution {
    public int maxRotateFunction(int[] nums) {
        int sum = 0;
        int f0 = 0;
        int n = nums.length;
        for(int i = 0; i < n ; i++){
            sum += nums[i];
            f0 += i*nums[i];
        }
        int res = f0;
        int f_per = f0;
        for(int i = 1 ;i<n;i++){
            int f = sum + f_per - (n * nums[n - i] );
            res = Math.max(res,f);
            f_per = f; 
        }
        return res;
    }
}
