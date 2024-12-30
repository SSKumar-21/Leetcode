int maximumCount(int* nums, int numsSize) {
    int n=0,p=0;
    for(int i=0;i<numsSize;i++){
        if(nums[i]>0){
            p++;
        }
        if(nums[i]<0){
            n++;
        }
    }
    if(n>p){
        return n;
    }
    return p;
}
