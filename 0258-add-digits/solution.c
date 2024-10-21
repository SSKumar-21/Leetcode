int sumTheDigit(int n){
    int rem,sum=0;
    while(n>0){
        rem=n%10;
        sum+=rem;
        n/=10;
    }
    
    return sum;
}


int addDigits(int num) {
    int res;
    res=sumTheDigit(num);
    while(1){
    if(res/10 == 0){
        return res;
    }
    else{
        res=sumTheDigit(res);
    }
    }
}
