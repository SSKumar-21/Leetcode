class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        if(s.isEmpty()){
            return 0;
        }
        int i=0,sign=1;
        long res=0;

        if(s.charAt(i)=='+' || s.charAt(i)=='-'){
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }
        while(i<s.length() && Character.isDigit(s.charAt(i))){
            res=res*10 + (s.charAt(i)-'0');

            if(sign*res>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(sign*res<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
                
            }
            i++;
        }
        return (int)(sign*res);
    }
}
