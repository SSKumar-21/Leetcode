class Solution {
    public int maxDepth(String s) {
        int c = 0;
        int res = 0;
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if (ch == '('){
                c++;
                res = Math.max(c,res);
            } else if (ch == ')'){
                c--;
            }
        }
        return res;
    }
}
