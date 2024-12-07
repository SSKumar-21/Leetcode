int averageValue(int* nums, int numsSize) {
    int sum=0,n=0;
    for(int i=0;i<numsSize;i++){
        if(nums[i]%2==0 && nums[i]%3==0){
            sum+=nums[i];
            n++;
        }
    }
    if(n==0){
        return 0;
    }
    else{
        return sum/n;
    }
}
