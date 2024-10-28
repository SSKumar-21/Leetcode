int firstMissingPositive(int* nums, int numsSize) {
     int *freq=malloc(100000*sizeof(int));
    if (freq==NULL){ 
        return 1;
    }
    
    int i,negative=0;
    
    for (int i = 0; i < 100000; i++) {
        freq[i] = 0;
    }
    
    for(int i=0;i<numsSize;i++) {
        if (nums[i]>0 && nums[i]<=100000) {
            freq[ nums[i] - 1 ] = 1;  
        }
        if(nums[i]<0){
            negative++;
        }
    }
    
    
    if(negative==numsSize && negative!=0){
        return 1;
    }
    
    
     for (int i=0;i<100000;i++) {
        if(freq[i]==0) {
            free(freq);
            return i+1; 
        }
    }
    free(freq);
    return 100001;
}
