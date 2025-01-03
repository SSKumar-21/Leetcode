class Solution {
    public int waysToSplitArray(int[] nums) {
    int c=0;
    long sum=0, l=0, r=0;
    for(int i=0;i<nums.length;i++){
        sum+=nums[i];
    }

    for(int i=0;i<nums.length-1;i++){
        l+=nums[i];
        r=sum-l;
        if(l>=r){
            c++;
        }
    }
    return c;
    }
}
