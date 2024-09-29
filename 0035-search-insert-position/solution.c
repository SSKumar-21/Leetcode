int searchInsert(int* nums, int numsSize, int target) {
    int check=0,i,x=0;
    for(i=0;i<numsSize;i++){
        if(nums[i]==target){
            x=i;
            check=1;
            break;
        }
    }
    if(!check){
        for(i=0;i<numsSize;i++){
        if(target>nums[i]){
            x=i+1;
        }
        else{
            break;
        }
    }
    }
    return x;
}
