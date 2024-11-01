int rob(int* nums, int numsSize) {
     if(numsSize==0){
          return 0;
      }
    if(numsSize==1){
    return nums[0];
    } 
    
    int *res=malloc(numsSize*sizeof(int));
    res[0]=nums[0];
    res[1]=(nums[0]>nums[1])?nums[0]:nums[1]; 

    for (int i=2;i<numsSize;i++) {
        res[i]=( res[i-1] > (res[i-2]+nums[i]) ) ? res[i-1] : (res[i-2]+nums[i]);
    }
    
    int result=res[numsSize - 1];
    free(res); 
    return result;
}
