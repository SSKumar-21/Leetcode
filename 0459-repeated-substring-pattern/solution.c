bool repeatedSubstringPattern(char* s) {
     int len=strlen(s);
    char* dou=malloc(2*len+1);
    strcpy(dou,s);
    strcat(dou,s);

    bool res=(strstr(dou+1,s) != NULL) && (strstr(dou+1,s)<dou+len);
    free(dou);
    return res;
}
