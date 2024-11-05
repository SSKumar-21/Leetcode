int numSquares(int n) {
    int count[n+1],c=0,val=1,x=0;
	for(int i=0; i<n+1; i++) {
	    count[i]=i;
	    for(int j=1;j*j<=i;j++){
	        if(count[i]>count[i-j*j]+1){
	            count[i]=count[i-j*j]+1;
	        }
	    }
	}
	return count[n];
}
