class Solution {
    public int minBitFlips(int start, int goal) {
        String bGoal = Integer.toBinaryString(goal);
        String bStart = Integer.toBinaryString(start);
        int n = bGoal.length();
        int m = bStart.length();

        if(n != m){
            if(n > m){
                bStart = lenning(bStart,n - m);
            } else {
                bGoal = lenning(bGoal,m - n);
            }
        }
        n = bGoal.length();
        int res = 0;
        for(int i=0;i<n;i++){
            if(bGoal.charAt(i) != bStart.charAt(i)) res++;
        }
        return res;
    }
    private String lenning(String s, int n){
        while(n!=0){
            s = '0' + s;
            n--;
        }
        return s;
    }
}

