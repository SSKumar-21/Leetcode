#include<string.h>
int strStr(char* haystack, char* needle) {
    int i=0,j=0,check=0,len1=strlen(haystack), len2=strlen(needle);
    for(i=0;i<=len1-len2;i++){
	    for(j=0;j<len2;j++){
	        if(haystack[i+j]==needle[j]){
	         check++;   
	        }
	    }
	    if(check==len2){
	        break;
	    }
	    check=0;
	}
	if(check==len2){
	        return i;
	    }
	    else{
	        return -1;
	    }
}
