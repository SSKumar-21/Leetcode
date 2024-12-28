bool count(int n){
    int sum=0;
    while(n>0){
        sum=sum+(n%10);
        n/=10;
    }
    return sum%2==0;
}
int countEven(int num) {
    if(num<2){
        return 0;
    }
    int c=0;
    for(int i=2;i<=num;i++){
        if(count(i)){
            c++;
        }
    }
    return c;
}
