int countPrimes(int n) {
    if(n<2){
        return 0;
    }
    
    int prime=0,i,j,arr[n];
    arr[0]=0;
    arr[1]=0;
    
    for(i=2;i<n;i++){
        arr[i]=1;
    }
    
    for(i=2;i*i<=n;i++){
        for(j=i*i;j<n;j+=i){
            arr[j]=0;
        }
    }
    for(i=0;i<n;i++){
        if(arr[i]){
            prime++;
        }
    }
    return prime;
}
