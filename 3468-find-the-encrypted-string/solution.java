class Solution {
    public String getEncryptedString(String s, int k) {
        int n=s.length();
        k=k%n;
        String r=s.substring(0,k);
        r=s.substring(k,n)+r;
        return r;
    }
}
