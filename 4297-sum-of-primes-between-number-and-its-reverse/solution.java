class Solution {
    public int sumOfPrimesInRange(int n) {
        int nr = 0;
        int a = n;
        while(a!=0){
            nr = nr*10 + a%10;
            a /= 10;
        }
        int min = Math.min(n,nr);
        int max = Math.max(n,nr);
        int res = 0;
        // System.out.println(nr+" "+min+" "+max);
        if (min == 1) min++;
        for(int i =min ;i<=max;i++){
            boolean c = true;
            for(int j = 2; j<i ;j++ ){
                if (i%j==0) {
                    c = false;
                    break;
                }
            }
            if (c) {
        // System.out.println(i);

                res += i;
            }
        }
        return res;
     }
}
