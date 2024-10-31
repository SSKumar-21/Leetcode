/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* selfDividingNumbers(int left, int right, int* returnSize) {
        int *res=malloc((right-left+1)*sizeof(int));
    *returnSize=0;
    int index=0;
    
    for (int i=left;i<=right;i++) {
        int x=i;
        bool check=true;
        while(x>0){
            int rem=x%10;
            if(rem==0 || i%rem!=0){
                check=false;
                break;
            }
            x/=10;
        }
        if(check){
            res[index++]=i;
            (*returnSize)++;
        }
    }
    
    res = realloc(res, (*returnSize) * sizeof(int));
    return res;
}
