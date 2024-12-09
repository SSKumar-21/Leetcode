/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* findDuplicates(int* nums, int numsSize, int* returnSize) {
     int freq[100001] = {0}; 
    int index = 0;
    *returnSize = 0;
    for (int i = 0; i < numsSize; i++) {
        freq[nums[i]]++;
    }
    int* res = malloc(numsSize * sizeof(int));
    for (int i = 0; i < 100000; i++) {
        if (freq[i]>1) {
            res[index++] = i ;
            (*returnSize)++;
        }
    }

    return res;
}
