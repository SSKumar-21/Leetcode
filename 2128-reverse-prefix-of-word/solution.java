class Solution {
    public String reversePrefix(String word, char ch) {
        if(!word.contains(String.valueOf(ch))){
            return word;
        }
        int i = word.indexOf(ch);
        String res="";
        for(int j=0;j<word.length();j++){
            if(j<=i){
                res=word.charAt(j) + res;
            } else {
                res = res + word.charAt(j);
            }
        }
        return res;
    }
}
