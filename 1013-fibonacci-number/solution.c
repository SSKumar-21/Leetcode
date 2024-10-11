

int fib(int n){
int c,x=0,y=1;
    if (n == 0)
        return 0;
    if (n == 1)
        return 1;
    for (int i = 0; i < n - 1; i++) {
        c = x + y;
        x = y;
        y = c;
    }
    
    return c;
}
