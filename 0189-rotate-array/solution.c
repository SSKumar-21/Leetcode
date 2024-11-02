void rotate(int* nums, int numsSize, int k) {
    while(k>numsSize){
         k=abs(numsSize-k);
    }
    int index=numsSize-k,i;
    int *res=malloc(numsSize*sizeof(int));
    int x=0;
    
    for(i=index;i<numsSize;i++){
        res[x++]=nums[i];
    }
    for(i=0;i<index;i++){
        res[x++]=nums[i];
    }
    for(int i=0;i<numsSize;i++){
        nums[i]=res[i];
    }
    free(res);
}
