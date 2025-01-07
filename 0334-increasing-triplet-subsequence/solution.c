bool increasingTriplet(int* nums, int numsSize) {
    if(numsSize<3){
            return false;
        }
        int min[numsSize];
        int max[numsSize];
        int m=nums[0];
        for(int i=0;i<numsSize;i++){
            if(m>nums[i]){
                m=nums[i];
            }
            min[i]=m;
        }
        m=nums[numsSize-1];
        for(int i=numsSize-1;i>=0;i--){
            if(m<nums[i]){
                m=nums[i];
            }
            max[i]=m;
        }
        for(int i=0;i<numsSize;i++){
            if(min[i]<nums[i] && nums[i]<max[i]){
                return true;
            }
        }
        return false;
}
