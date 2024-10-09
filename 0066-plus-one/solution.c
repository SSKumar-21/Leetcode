/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* plusOne(int* digits, int digitsSize, int* returnSize) {
     int* result = (int*)malloc((digitsSize + 1) * sizeof(int));
    
    int i,c=1,x;
    for(i=digitsSize-1;i>=0;i--){
        x=digits[i]+c;
        result[i+1] = x%10;
        c=x/10;
    }
    
    if(c>0){
        result[0]=c;
        *returnSize=digitsSize+1;
    }
    else{
        for(i=0;i<digitsSize;i++){
            result[i]=result[i+1];
        }
        *returnSize= digitsSize; 
    }
    
 return result;
 
}
