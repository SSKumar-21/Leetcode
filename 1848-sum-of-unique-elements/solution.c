int sumOfUnique(int* nums, int numsSize) {
    int freq[101]= {0},sum=0;
	for(int i=0; i<numsSize; i++) {
		freq[ nums[i] ]++;

	}
	for(int i=0; i<numsSize; i++) {
		if(freq[nums[i]]==1) {
			sum+=nums[i];
		}
	}
	return sum;
}
