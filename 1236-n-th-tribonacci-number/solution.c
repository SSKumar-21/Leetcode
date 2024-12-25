int tribonacci(int n) {
     if(n==0){
            return 0;
        }
        if(n==1 || n==2){
            return 1;
        }
        int x0=0;int x1=1;int x2=1;
        int sum=0;
        for(int i=2;i<n;i++){
            sum=x0+x1+x2;
            x0=x1;
            x1=x2;
            x2=sum;
        }
        return sum;
}
