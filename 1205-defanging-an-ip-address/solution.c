

char * defangIPaddr(char * address){
	int i=0,x=0,dot=0;

	while(address[i]!='\0') {
		if(address[i]=='.') {
			dot++;
		}
		i++;
	}

	char* res = malloc((i + dot * 2 + 1)*sizeof(char));
	if(res==NULL) {
		return NULL;
	}

	i=0;
	while(address[i]!='\0') {

		if(address[i]=='.') {
			res[x++]='[';
			res[x++]='.';
			res[x++]=']';
		}
		else {
			res[x++]=address[i];
		}

		i++;
	}

	res[x]='\0';
	return res;
}
