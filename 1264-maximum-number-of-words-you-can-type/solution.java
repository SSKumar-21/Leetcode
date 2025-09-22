class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int res = 0;
        for(String word: words){
            int n = word.length();
            int count = 0;
            for(int i=0; i<n ; i++){
                char ch = word.charAt(i);
                if(brokenLetters.contains(String.valueOf(ch))){
                    break;
                } else {
                    count++;
                }
            }
            if(count == n){
                res++;
            }
        }
        return res;
    }
}
