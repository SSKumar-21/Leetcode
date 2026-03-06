class Solution {
    public String interpret(String command) {
        String res ="";
        for(int i=0;i<command.length();i++){
            char s = command.charAt(i);
            if(s == 'G'){
                res = res + 'G';
            } else if (s == '('){
                char s1 = command.charAt(i+1);
                if(s1 == 'a'){
                    res = res + "al";
                    i+=3;
                } else {
                    res = res + 'o';
                    i+=1;
                }
            }
        }
        return res;
    }
}
