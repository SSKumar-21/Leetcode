class Solution {
    public int numSteps(String s) {
        int c = 0, res = 0;
        for(int i=s.length()-1;i>0;i--){
            int b = s.charAt(i) - '0';
            if(b + c == 1){
                res += 2;
                c = 1;
            } else {
                res++;
            }
        }
        return c+ res;
    }
}
