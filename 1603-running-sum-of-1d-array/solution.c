/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* runningSum(int* nums, int numsSize, int* returnSize) {
    int sum=0;
    for(int i=1;i<numsSize;i++){
        sum=nums[i-1]+nums[i];
        nums[i]=sum;
    }
    *returnSize=numsSize;
    return nums;
}
