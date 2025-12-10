class Solution {
    public int countPartitions(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int sum2 =0;
        int res = 0;
        for (int i=0;i<nums.length-1;i++){
            sum -= nums[i];
            sum2 += nums[i];
            int dif = (sum2 - sum) ;
            if(dif%2 == 0){
                res++;
            }
        }

        return res;
    }
}
