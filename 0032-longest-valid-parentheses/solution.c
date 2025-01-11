int longestValidParentheses(char* s) {
    int l=0,r=0,max=0;
        for(int i=0;i<strlen(s);i++){
            char c=s[i];
            if(c=='('){
                l++;
            } else {
                r++;
            }
            if(l==r){
                max=(max>2*l)? max : 2*l;
            }
            if(r>l){
                r=0;
                l=0;
            }
        }
        l=0;
        r=0;
        for(int i=strlen(s) -1 ;i>=0;i--){
            char c=s[i];
            if(c=='('){
                l++;
            } else {
                r++;
            }
            if(l==r){
                max=(max>2*l)? max : 2*l;
            }
            if(r<l){
                r=0;
                l=0;
            }
        }
        return max;
}
