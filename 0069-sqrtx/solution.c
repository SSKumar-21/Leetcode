int mySqrt(int x) {
    long long int i=1;
    while(i*i<=x){
        if(i*i==x){
            return i;
        }
        i++;
    }

    long long int l=1,r=x , m;
    while(l<=r){
        m=l+(r-l)/2;
        if(m*m<x){
            l=m+1;
        } else{
            r=m-1;
        }
    }
    return r;
}
