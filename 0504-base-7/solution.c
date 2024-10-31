char* convertToBase7(int num) {
    if (num == 0) {
		char* res=malloc(2*sizeof(char));
		res[0]='0';
		res[1]='\0';
		return res;
	}

	int c=0;
	if(num<0) {
		num*=-1;
		c=1;
	}

	int rem,i=0;
	char *res=malloc(12* sizeof(char)+1);
	while(num>0) {
		rem=num%7;
		res[i++] = '0' + rem;
		num/=7;
	}
	res[i] = '\0';
	for (int j=0;j<i/2;j++) {
		char temp=res[j];
		res[j]=res[i-j-1];
		res[i-j-1]=temp;
	}

	if(c) {
		char *result=malloc(i* sizeof(char)+2);
		sprintf(result,"%c%s",'-',res);
		free(res);
		return result;
	}

	return res;   
}
