class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        int req = t.length();
        int n = s.length();
        if(n == 0 || req==0) return "";
        int l = 0;
        int r = 0; 
        int len = Integer.MAX_VALUE;
        int sindex = 0;
        
        for(int i=0;i<t.length();i++) map.put(t.charAt(i), map.getOrDefault(t.charAt(i),0)+1);
        
        while(r<n){
            char c = s.charAt(r);
            if (map.containsKey(c)){
                if(map.get(c) > 0){
                    req--;
                }
                map.put(c, map.get(c) - 1);
                
            }
            while(req == 0){
                if(len > r-l+1){
                    len = r - l + 1;
                    sindex = l;
                }
                char d = s.charAt(l);

                if (map.containsKey(d)){
                    map.put(d, map.get(d) + 1);
                    if(map.get(d) > 0){
                        req++;
                    }
                } 
                l++;
            }
            r++;
        }
        if(len == Integer.MAX_VALUE){
            return "";
        }
        return s.substring(sindex, sindex + len);
    }
}
