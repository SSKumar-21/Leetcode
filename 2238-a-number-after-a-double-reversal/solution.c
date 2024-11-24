int reverse(int x) {
	int y=0,res=0;
	while(x>0) {
		y=x%10;
		res=res*10+y;
		x/=10;
	}
	return res;
}

bool isSameAfterReversals(int num) {
    int r=reverse(num);
    r=reverse(r);
    return num==r;
}
