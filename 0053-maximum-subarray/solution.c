int maxSubArray(int* nums, int numsSize) {
    int i,max=nums[0],sum=0;
    
    if(numsSize==1){
        return nums[0];
    }
    
    for(i=0;i<numsSize;i++){
        sum+=nums[i];
        if(sum>max){
            max=sum;
        }
        if(sum<0){
            sum=0;
        }
    }
    
    return max;
}
