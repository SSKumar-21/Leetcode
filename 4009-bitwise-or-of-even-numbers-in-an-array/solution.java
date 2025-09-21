class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int res = 0; 
        for(int ele:nums){
            if(ele%2==0){
                res = res | ele ;
            }
        }
        return res;
    }
}
