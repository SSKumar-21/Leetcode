/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
bool checkZero(int n){
    while(n>0){
        int rem=n%10;
        if(rem==0){
            return false;
            break;
        }
        n=n/10;
    }
    return true;
}


int* getNoZeroIntegers(int n, int* returnSize) {
    int *res=malloc(2*sizeof(int));
    res[0]=0,res[1]=0;
    *returnSize=2;
    int i=1,x=n-1;
    while(i<=x){
        if( checkZero(i) && checkZero(x)){
            res[0]=i;res[1]=x;
            return res;
        }
        i++;
        x--;
    }
    return res;
}
