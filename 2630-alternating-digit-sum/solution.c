int alternateDigitSum(int n) {
    int sum=0,check=0,len=0,x=n,rem;
    while(x>0){
        len++;
        x/=10;
    }
    if(len%2==0){
        check=1;
    }else{
        check=0;
    }
    while(n>0){
        rem=n%10;
        if(check){
            sum-=rem;
            check=0;
        }
        else{
            sum+=rem;
            check=1;
        }
        n/=10;
    }
    return sum;
}
