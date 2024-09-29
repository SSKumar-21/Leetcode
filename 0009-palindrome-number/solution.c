bool isPalindrome(int x) {
    int a=0,temp;
	int y=x,b=x;
	while(y>=1) {
		temp=y%10;
        if (a > (INT_MAX - temp) / 10) {
            return false;
        }
		a=a*10+temp;
		y=y/10;
	}
    return x==a;
}
