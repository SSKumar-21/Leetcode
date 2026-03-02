class Solution {
    public String reversePrefix(String s, int k) {
        String sub = s.substring(0,k);
        String ori = s.substring(k);
        sub = new StringBuilder(sub).reverse().toString();
        return sub+ori;
    }
}
