int singleNumber(int* nums, int numsSize) {
    int i=0,j=0,k,count=0;
	
	for(i=0;i<numsSize;i++){
	    k=nums[i];
	    for(j=0;j<numsSize;j++){
	        if(k==nums[j] && i!=j){
	            count++;
	        }
	    }
	    if(!count){
	        break;
	    }
	    count=0;
	}
	return k;
}
