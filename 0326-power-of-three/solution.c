bool isPowerOfThree(int n) {

    int i=0,x=0,check=0;
    if(n==1){
            return true;
        }
    while(x<=n && n%3==0 && i<31){
        

        x=pow(3,i);
        if(x==n){
            return true;
        }
        i++;
    }
    
    return false;
}
