class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> map = new HashMap<>();
        int alpha = 97;
        for(int i=0;i<key.length();i++){
            char c = key.charAt(i);
            if(!map.containsKey(c) && c!=' '){
                map.put(c,(char)alpha++);
            }
        }
        String res = "";
        for(int i=0;i<message.length();i++){
            char c = message.charAt(i);
            if(c == ' ') res = res + c;
            else res = res + map.get(c);
        }
        return res;
    }
}
