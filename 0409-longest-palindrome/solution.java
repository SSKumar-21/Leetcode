class Solution {
    public int longestPalindrome(String s) {
        if (s.length() == 1) {
            return 1;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                int n = map.get(ch);
                map.put(ch, n + 1);
            } else {
                map.put(ch, 1);
            }
        }
         int res = 0;
        boolean hasOdd = false;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int freq = entry.getValue();
            if (freq % 2 == 0) {
                res += freq;
            } else {
                res += freq - 1;
                hasOdd = true;
            }
        }

        if (hasOdd) {
            res += 1;
        }


        return res;
    }
}
