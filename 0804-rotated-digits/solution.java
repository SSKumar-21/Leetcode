class Solution {
    public int rotatedDigits(int n) {
        int res = 0;
        for(int i = 0; i <= n; i++ ){
            if(check(i)){
                res++;
            }
        }
        return res;
    }

    private boolean check(int n){
        boolean c = false;
        while(n>0){
            int a = n%10;
            if(a==3 || a==4 || a==7) return false;
            if (a == 2 || a==5 ||a==6||a==9) c = true;
            n /= 10;
        }
        return c ; 
    }

}
