class Solution {
    public boolean isSubsequence(String s, String t) {
        int sLen=0;
        int tLen=0;
        while(sLen<s.length() && tLen<t.length()){
            if(s.charAt(sLen)==t.charAt(tLen)){
                sLen++;
            }
            tLen++;
        }
        return sLen==s.length();
    }
}
