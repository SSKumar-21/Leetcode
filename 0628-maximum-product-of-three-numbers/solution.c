int maximumProduct(int* nums, int numsSize) {
    int max1=INT_MIN,max2=max1,max3=max2;
    int min1=INT_MAX,min2=min1;
    
    for(int i=0;i<numsSize;i++){
        if(max1<nums[i]){
            max3=max2;
            max2=max1;
            max1=nums[i];
        }
        else if(max2<nums[i]){
            max3=max2;
            max2=nums[i];
        }
        else if(max3<nums[i]){
            max3=nums[i];
        }
        
        if(min1>nums[i]){
            min2=min1;
            min1=nums[i];
        }
        else if(min2>nums[i]){
            min2=nums[i];
        }
    }
    
    int p1=max1*max2*max3;
    int p2=max1*min1*min2;
    if(p1>p2){
        return p1;
    }
    return p2;
}
