char* multiply(char* num1,char* num2) {
    int len1=strlen(num1),len2=strlen(num2);

    if(len1==0||len2==0||(num1[0]=='0'||num2[0]=='0')) {
        char* result=malloc(2*sizeof(char));
        result[0]='0';
        result[1]='\0';
        return result;
    }
    
    int* result=calloc(len1+len2,sizeof(int));
    for(int i=len1-1;i>=0;i--) {
        for(int j=len2-1;j>=0;j--) {
            int mul=(num1[i]-'0')*(num2[j]-'0');
            int sum=mul+result[i+j+1];
            result[i+j+1]=sum%10;
            result[i+j]+=sum/10;
        }
    }
    char* str_result=malloc((len1+len2+1)*sizeof(char));
    int k=0;
    while(k<len1+len2&&result[k]==0) {
        k++;
    }
    if(k==len1+len2) {
        str_result[0]='0';
        str_result[1]='\0';
        free(result);
        return str_result;
    }
    for(int i=k;i<len1+len2;i++) {
        str_result[i-k]=result[i]+'0';
    }
    str_result[len1+len2-k]='\0';
    free(result);
    return str_result;
}
