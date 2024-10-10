bool isAnagram(char* s, char* t) {
    if((strlen(s)!=strlen(t)) || (strlen(s)==0 || strlen(t)==0)){
        return false;
    }
    	int check[26]={0};
    	for(int i=0;i<strlen(t);i++){
    	    check[s[i]-'a']++;
    	    check[t[i]-'a']--;
    	}
    	for(int i=0;i<26;i++){
    	    if(check[i]!=0){
    	        return false;
    	    }
    	}
    	return true;
}
