int bitwiseComplement(int n) {
    if(n==0){
        return 1;
    }
    
    int i=0,x=0;
    while(x<n){
        x=pow(2,i);
        i++;
    }
    
    int *res=malloc(i* sizeof(int));
    
    x=n;
    i=0;
    while(x>0){
        if(x%2==0){
            res[i++]=1;
        }
        else{
            res[i++]=0;
        }
        x/=2;
    }
    
    int result=0;
    int power=1;
   
   for (int k = 0; k < i; k++) {
        result += res[k] * power;
        power*=2;  
    }
    return result;
}
