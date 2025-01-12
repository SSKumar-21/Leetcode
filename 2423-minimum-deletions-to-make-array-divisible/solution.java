class Solution {
    public int minOperations(int[] nums, int[] numsDivide) {
        int del=0,i=0,j=0,c=1;
        Arrays.sort(nums);
        Arrays.sort(numsDivide);
        for(i=0;i<nums.length;i++){
            c=1;
            while(i<nums.length-1 && nums[i]==nums[i+1]){
                c++;
                i++;
            }
            for(j=0;j<numsDivide.length;j++){
                if(numsDivide[j]%nums[i]!=0){
                    del=del+c;
                    break;
                }
            }
            if(j==numsDivide.length){
                break;
            }
        }
        del=(del==nums.length)?-1 : del ;
        return del;
    }
}
