class Solution {
    public boolean checkString(String s) {
        boolean ch = true;
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if (c == 'a' && !ch) return false; 
            if (c == 'b') ch = false;
        }
        return true;
    }
}