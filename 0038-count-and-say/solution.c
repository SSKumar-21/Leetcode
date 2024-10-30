char* countAndSay(int n) {
     if(n==1){
        return "1";
    }
    char *rec=countAndSay(n-1);
    int size=strlen(rec);
    
    char *result=malloc(2*size*sizeof(char)+1);
    int j=0,count=1;
    for(int i=1;i<=size;i++){
        if(rec[i]==rec[i-1]){
            count++;
        }else{
            j+=sprintf(result+j,"%d%c",count,rec[i-1]);
            count =1;
        }
    }
    return result;
}
