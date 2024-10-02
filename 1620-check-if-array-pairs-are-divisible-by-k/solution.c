bool canArrange(int* arr, int arrSize, int k) {
    int ans[k],i,j,x;
    
	for(i=0; i<k; i++) {
		ans[i]=0;
	}

	for(i=0; i<arrSize; i++) {
		x=arr[i]%k;
		if(x<0) {
			x+=k;
		}
		ans[x]++;
	}

	if (ans[0]%2!=0) {
		return 0;
	}

	for (int i = 1; i <= k / 2; i++) {
		if (ans[i] != ans[k - i]) {
			return false;
		}
	}

	return 1;    
}
