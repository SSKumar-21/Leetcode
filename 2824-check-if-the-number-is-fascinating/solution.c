bool isFascinating(int n) {
     int x=n;
        int a[10]={0,0,0,0,0,0,0,0,0,0};
        while(x){
            a[x%10]++;
            x/=10;
        }
        x=2*n;
        while(x){
            a[x%10]++;
            x/=10;
        }
        x=3*n;
        while(x){
            a[x%10]++;
            x/=10;
        }
        if(a[0]!=0){
                return false;
            }
        for(int i=1;i<10;i++){
            if(a[i]!=1){
                return false;
            }
        }
        return true;
}
