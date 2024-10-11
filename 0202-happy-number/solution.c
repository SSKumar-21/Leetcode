int getNext(int n) {
    int sum = 0;
    while (n > 0) {
        int rem = n % 10;
        sum += rem * rem;
        n /= 10;
    }
    return sum;
}

bool isHappy(int n){
    int c=n,x=getNext(n);
    
   while(x!=1 && c!=x){
       c=getNext(c);
       x=getNext(getNext(x));
   }
   return x == 1;
}
