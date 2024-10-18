bool isPowerOfFour(int n) {
    	if(n==1) {
		return true;
	}
	int i=0,x,check=0;

	while(x<=n && n%4==0 && i<31) {
		x=pow(4,i);
		if(x==n) {
			return true;
		}
		i++;
	}

	return false;
}
