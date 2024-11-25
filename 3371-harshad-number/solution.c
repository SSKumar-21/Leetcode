int sumOfTheDigitsOfHarshadNumber(int x) {
    int a=x,div,sum=0;
    while(a>0){
        sum=sum+(a%10);
        a/=10;
    }
    div=x/sum;
    if(div*sum==x){
        return sum;
    }
    return -1;
}
