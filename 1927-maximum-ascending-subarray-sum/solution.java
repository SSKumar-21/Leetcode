class Solution {
    public int maxAscendingSum(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int j = 1;
        int i = j-1;
        int sum = 0;
        int res = 0;
        while(i<nums.length -1 && j<nums.length){
            while(j<nums.length && nums[j-1] < nums[j]){
                j++;
            }
            for(int x=i ; x<j;x++) sum+=nums[x] ;
            if(res<sum){
                res = sum;
            }
            sum = 0;
            i=j;
            j++;
        }
        return res;
    }
}
