bool isPowerOfTwo(int n) {
     if(n==1){
        return true;
    }
    int i=0,x=0,check=0;
    while(x<=n && n%2==0 && i<31){
        x=pow(2,i);
        if(x==n){
            return true;
        }
        i++;
    }
    return false;
}
