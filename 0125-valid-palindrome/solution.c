bool isPalindrome(char* s) {
    int r=strlen(s)-1,l=0;

    while(l<r){
        while(l<r && !isalnum(s[l])){
            l++;
        }
        while(!isalnum(s[r]) && l<r){
            r--;
        }
        if(tolower(s[l])!=tolower(s[r])) {
            return false;
        }
        r--;
        l++;
    }
    return true;
}
