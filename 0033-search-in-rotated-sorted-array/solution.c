int search(int* nums, int numsSize, int target) {
    if(nums[0]>target){
        for(int i=0;i<numsSize;i++){
            if(nums[i]==target){
                return i;
            }
        }
    }
    else{
        for(int i=numsSize-1;i>=0;i--){
            if(nums[i]==target){
                return i;
            }
        }
    }
    return -1;
}
