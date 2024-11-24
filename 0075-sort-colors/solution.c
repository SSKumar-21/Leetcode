void sortColors(int* nums, int numsSize) {
    	for(int j=0; j<numsSize; j++) {
		for(int i=0; i<numsSize; i++) {
			if(nums[i]>nums[j]) {
				int temp=nums[i];
				nums[i]=nums[j];
				nums[j]=temp;
			}
		}
	}
}
