int reverse(int x){
int a=x,y=0,res=0;
    
    if(x<=INT_MIN){
        return 0;
    }
    if(x<0){
        a=-a;
    }

    while(a>0){
        y=a%10;
        
        if(res>(INT_MAX - y)/10){
            return 0;
        }

        res=res*10+y;
        a/=10;
    }
    
    if(x<0){
        res=-res;
    }
    return res;
}
