int lengthOfLastWord(char* s) {
    int len=strlen(s),lastWord=0;
     if(len==1 && s[0]!=' '){
        return 1;
    }
    if(len==1 && s[0]==' '){
        return 0;
    }
    while (len){
        if(s[len-1]!=' '){
            lastWord++;
        }
        len--;
        if(lastWord!=0 && s[len]==' '){
            break;
        }
    }
    
    return lastWord;
}
