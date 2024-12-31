int scoreOfString(char* s) {
    int sum=0;
    for(int i=0;i<strlen(s)-1;i++){
        sum=sum+abs(s[i]-s[i+1]);
    }
    return sum;
}
