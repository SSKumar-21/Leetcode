/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* getSneakyNumbers(int* nums, int numsSize, int* returnSize) {
    int *arr=malloc(sizeof(int)*2);
    *returnSize=2;
    int index=0;
    int freq[numsSize];
    for(int i=0;i<numsSize;i++){
        freq[i]=0;
    }
    for(int i=0;i<numsSize;i++){
        freq[nums[i]]++;
        if(freq[nums[i]]>1){
            *(arr+index)=nums[i];
            index++;
        }
    }
    return arr;
}
