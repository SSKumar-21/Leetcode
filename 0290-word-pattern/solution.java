class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        int n = pattern.length();
        int m = words.length;

        if (n != m) return false;
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> used = new HashSet<>();

        for (int i = 0; i < n; i++) {
            char x = pattern.charAt(i);
            String y = words[i];

            if (map.containsKey(x)) {
                if (!map.get(x).equals(y)) return false;
            
            } 
            else {
                if (used.contains(y)) return false;
                map.put(x, y);
                used.add(y);
            }
        }
        return true;
    }
}
