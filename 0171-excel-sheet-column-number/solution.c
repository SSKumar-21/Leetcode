int titleToNumber(char* columnTitle) {
   	int sum=0;

	for(int i=0; i<strlen(columnTitle); i++) {
		int count= columnTitle[i] - 'A' +1;
		sum=(sum*26)+count;

	}


	return sum; 
}
