class Solution {
    public boolean isTrionic(int[] nums) {
        if(nums.length <=3 ) return false;
        int i = 1;
        int p=0,q=1,n=0;

        for(;i<nums.length;i++){
            if(nums[i] > nums[i-1]){
                p++;
            } else {
                break;
            }
        }
        for(;i<nums.length;i++){
            if(nums[i] < nums[i-1]){
                q++;
            } else {
                break;
            }
        }
        for(;i<nums.length;i++){
            if(nums[i] > nums[i-1]){
                n++;
            } else {
                break;
            }
        }
        
        return nums.length == (n+q+p) && (p!= 0 && q!=1 && n!=0) ;
    }
}
