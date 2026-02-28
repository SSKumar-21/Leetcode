class Solution {
    public int firstUniqChar(String s) {
        HashMap <Character,Integer> map = new HashMap<>();
        for(int i = 0;i < s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                int count = map.get(c);
                map.put(c,count+1);
            } else {
                map.put(c,1);
            }
        } 
        for(int i = 0;i < s.length();i++){
            char c = s.charAt(i);
            int count = map.get(c);
            if (count == 1) return i;
        }
        return -1;
    }
}
