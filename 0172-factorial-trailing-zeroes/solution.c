int trailingZeroes(int n) {
     int mul=5,sum=0;
    while(n>=mul){
        sum+=(n/mul);
        mul*=5;
    }
    return sum;
}
