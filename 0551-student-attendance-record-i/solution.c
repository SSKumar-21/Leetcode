bool checkRecord(char* s) {
    int a=0,l=0;
        for(int i=0;i<strlen(s);i++){
            char c = s[i];
            if(c=='L'){
                l++;
                if(l>=3){
                    return false;
                }
            } else if(c=='A'){
                a++;
                l=0;
            } else {
                l=0;
            }
        }
        if(a>=2){
            return false;
        }
        return true;
}
