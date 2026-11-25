class Solution {
    public String compressedString(String word) {
        String res = "";
        int n = word.length();
        for (int i = 0; i < n; i++) {
            int count = 1;
            int j = i+1;
            char c = word.charAt(i);
            while (j < n && c == word.charAt(j)) {
                count++;
                j++;
            }
            i = j -1;
            while(count > 9){
                res = res + "9" + c ;
                count -= 9;
            }
            if( count != 0) res = res + String.valueOf(count) + c;
        }
        return res;
    }
}