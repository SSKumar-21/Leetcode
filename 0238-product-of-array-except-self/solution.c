/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* productExceptSelf(int* nums, int numsSize, int* returnSize) {
    int *res=malloc(numsSize*sizeof(int));
    if (res==NULL) {
        return NULL;
    }
    res[0]=1;
    for (int i=1;i<numsSize;i++) {
        res[i]=res[i-1]*nums[i-1];
    }
    int x=1;
    for (int i=numsSize-1;i>=0;i--) {
        res[i]*=x; 
        x*=nums[i];
    }

    *returnSize=numsSize;
    return res; 
}
