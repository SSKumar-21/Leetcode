class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String res = "";
        for (String word : words){
            int ans = 0;
            for(int i = 0;i<word.length();i++){
                int c = word.charAt(i);
                c = c - 97;
                ans += weights[c];
            }
            ans = ans % 26;
            ans = 26 - ans + 96 ;
            res = res + String.valueOf((char)ans);;
        }
        return res;
    }
}
