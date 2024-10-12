

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* shuffle(int* nums, int numsSize, int n, int* returnSize){
int *res=malloc(numsSize*sizeof(int));
    int i,j=0,k=n;
    *returnSize=numsSize;
    
    for(i=0;i<numsSize;i++){
        if(i%2==0 && j<n){
            res[i]=nums[j++];
        }
        else {
            res[i]=nums[k++];
        }
    }
    return res;
}
