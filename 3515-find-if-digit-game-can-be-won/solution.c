bool canAliceWin(int* nums, int numsSize) {
    int sumS=0,sumD=0;
    for(int i=0;i<numsSize;i++){
        if(nums[i]<10){
            sumS+=nums[i];
        }
        else{
            sumD+=nums[i];
        }
    }
    return sumS!=sumD;
}
