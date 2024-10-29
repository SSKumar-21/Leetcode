/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* numbers, int numbersSize, int target, int* returnSize) {
    int start=0,end=numbersSize-1;
    
    while(start<end){
        int sum=numbers[start]+numbers[end];
        if(sum==target){
            int *res=malloc(2*sizeof(int));
            res[0]=start+1;
            res[1]=end+1;
            *returnSize=2;
            return res;
        }
        else if(sum>target){
            end--;
        }
        else{
            start++;
        }
    }
    *returnSize=0; 
    return NULL;
}
