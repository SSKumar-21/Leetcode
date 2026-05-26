class Solution {
    public int numberOfSpecialChars(String word) {
        int[] c = new int[26];
        int[] s = new int[26];
        int n = word.length();
        for(int i=0;i<n;i++){
            int a = word.charAt(i);
            if (a <= 90){
                c[a-65]++;
            } else {
                s[a-97]++;
            }
        }
        int res = 0;
        for(int i=0;i<26;i++){
            if(c[i] > 0 && s[i]>0) res ++;
        }
        return res;
    }
}
