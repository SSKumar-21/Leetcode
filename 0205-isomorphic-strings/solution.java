class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n = s.length();
        int m = t.length();

        if (n != m) return false;

        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> used = new HashSet<>();

        for (int i = 0; i < n; i++) {
            char x = s.charAt(i);
            char y = t.charAt(i);

            if (map.containsKey(x)) {
                if (map.get(x) != y) return false;
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

