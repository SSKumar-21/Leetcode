class Solution {
    public String removeStars(String s) {
        Stack<Character> word = new Stack<>();
        String res="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*' && !word.isEmpty()){
                word.pop();
            } else {
                word.push(s.charAt(i));
            }
        }
        while(!word.isEmpty()){
            res= word.pop() + res;
        }
        return res;
    }
}
