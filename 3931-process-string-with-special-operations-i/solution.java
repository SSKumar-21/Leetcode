class Solution {
    public String processStr(String s) {
        String res = "";
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (c=='%'){
                res = new StringBuilder(res).reverse().toString();
            } else if (c=='#'){
                res = res + res;
            } else if(c=='*'){
                int n = res.length();
                if(n == 0 || n==1) res = ""; 
                else res = res.substring(0, res.length() - 1);
            } else {
                res = res + c ;
            }
        }
        return res;
    }
}
