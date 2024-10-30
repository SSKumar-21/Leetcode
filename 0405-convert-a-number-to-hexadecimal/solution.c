char* toHex(int num) {
    	if (num == 0) {
		char* res=malloc(2*sizeof(char));
		res[0]='0';
		res[1]='\0';
		return res;
	}
	unsigned int n = (unsigned int)num;
	int rem,i=0;
	char *res=malloc(8* sizeof(char)+1 );
	while(n>0) {
		rem=n%16;
		if(rem<10) {
			res[i++] = '0' + rem;
		}
		else {
			res[i++] = 'a' + rem-10;
		}
		n/=16;
	}
	res[i] = '\0';
	for (int j = 0; j < i / 2; j++) {
		char temp = res[j];
		res[j] = res[i - j - 1];
		res[i - j - 1] = temp;
	}
	return res;
}
