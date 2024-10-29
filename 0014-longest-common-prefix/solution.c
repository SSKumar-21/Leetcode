char* longestCommonPrefix(char** strs, int strsSize) {
    if (strsSize == 0) {
		return "";
	}
	int index=0;
	while(1) {
		char currentChar=strs[0][index];

		for(int i=1; i<strsSize; i++) {
			if(strs[i][index]!=currentChar || strs[i][index]=='\0') {
				strs[0][index]='\0';
				return strs[0];
			}
		}

		if(currentChar=='\0') {
			break;
		}
		index++;
	}

	return strs[0];
}
