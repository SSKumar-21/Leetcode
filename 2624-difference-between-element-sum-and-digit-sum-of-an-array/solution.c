int Single(int n){
    int sum=0;
    while (n>0){
        sum+=(n%10);
        n/=10;
    }
    return sum;
}

int differenceOfSum(int* nums, int numsSize) {
    int sum=0,single=0;
    for(int i=0;i<numsSize;i++){
        sum+=nums[i];
        if(nums[i]>9){
        single+=Single(nums[i]);
        }
        else{
            single+=nums[i];
        }
    }
    return abs(sum-single);
}
