bool isBalanced(char* num) {
    int len=strlen(num);
    int even=0,odd=0,i=0;
    while(i<len){
        even=even+(num[i]-'0');
        i+=2;
    }
    i=1;
    while(i<len){
        odd=odd+(num[i]-'0');
        i+=2;
    }
    return odd==even;
}
