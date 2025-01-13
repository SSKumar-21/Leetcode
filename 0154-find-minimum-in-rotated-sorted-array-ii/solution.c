int findMin(int* nums, int numsSize) {
    int min=5000;
        for(int i=0;i<numsSize;i++){
            min=(min>nums[i])?nums[i]:min;
        }
        return min;
}
