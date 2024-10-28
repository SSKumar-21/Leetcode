int missingNumber(int* nums, int numsSize) {
    int freq[10000]={0};
    int i;
    for(i=0;i<numsSize;i++){
        freq[ nums[i] ]=1;
    }
    i=0;
    while(1){
        if(freq[i]==0){
            return i;
            break;
        }
        i++;
    }
}
