class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();
        String s;
        for(String str : words){
            s = "" ;
            for(int i=0;i<str.length();i++){
                int idx = str.charAt(i) - 'a';
                s = s + morse[idx];
            }
            set.add(s);
        }
        return set.size();
    }
}
