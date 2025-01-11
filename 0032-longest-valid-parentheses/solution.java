class Solution {
    public int longestValidParentheses(String s) {
        int l=0,r=0,max=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                l++;
            } else {
                r++;
            }
            if(l==r){
                max=Math.max(max,2*l);
            }
            if(r>l){
                r=0;
                l=0;
            }
        }
        l=0;
        r=0;
        for(int i=s.length() -1 ;i>=0;i--){
            char c=s.charAt(i);
            if(c=='('){
                l++;
            } else {
                r++;
            }
            if(l==r){
                max=Math.max(max,2*r);
            }
            if(r<l){
                r=0;
                l=0;
            }
        }
        return max;
    }
}
