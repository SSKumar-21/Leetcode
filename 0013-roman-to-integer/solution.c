#include<string.h>

int romanToInt(char* s) {
    char R[7]={'I','V','X','L','C','D','M'};
    int N[7]={1,5,10,50,100,500,1000};
    int len=strlen(s);
    int res[len],result=0;
    int i=0,j=0;
    
    while(i<len){
        for(j=0;j<7;j++){
            if(s[i]==R[j]){
                res[i]=N[j];
                break;
            }
        }
        i++;
    }
    
    for(j=0;j<len;j++){
        if(j<len-1 && res[j]<res[j+1]){
            res[j]= -res[j];
        }
        result+=res[j];
        
    }
    return result;
}
