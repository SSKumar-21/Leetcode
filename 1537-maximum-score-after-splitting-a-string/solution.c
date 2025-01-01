int maxScore(char* s) {
    int zero=0,one=0,max=0;
    int ls=0,le=0,rs=1,re=strlen(s);
    for(int i=0;i<strlen(s);i++){
        if(s[i]=='1'){
            one++;
        }
    }
    for(int i=0;i<strlen(s)-1;i++){
        if(s[i]=='0'){
            zero++;
        }
        else{
            one--;
        }
        max= (zero+one)>max ? zero+one : max ;
    }
    return max;
}
