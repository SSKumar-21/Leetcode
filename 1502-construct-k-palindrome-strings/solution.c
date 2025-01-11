bool canConstruct(char* s, int k) {
    if(strlen(s)==k){
            return true;
        }
        if(strlen(s)<k){
            return false;
        }
        int c=0;
        int arr[26];
        for(int i=0;i<26;i++){
            arr[i]=0;
        }
        for(int i=0;i<strlen(s);i++){
            int key=(int)(s[i]-'a');
            arr[key]++;
        }
        for(int i=0;i<26;i++){
            if(arr[i]%2!=0){
                c++;
            }
        }
        return c<=k;
}
