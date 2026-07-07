class Solution {
    public long sumAndMultiply(int n) {
        if (n==0) return 0;
        String str = String.valueOf(n);
        String nonDigit = "";
        long m = 0;
        for(int i=0;i<str.length();i++){
            if (str.charAt(i) != '0'){
                nonDigit = nonDigit + str.charAt(i);
                m += (long)(str.charAt(i) - '0');
            }
        }
        long num = Integer.parseInt(nonDigit);
        // System.out.println(num + " " +m + " "+ nonDigit);
        return num * m;
    }
}