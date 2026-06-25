class Solution {
    public int minLengthAfterRemovals(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        return Math.abs( map.getOrDefault('a', 0) - map.getOrDefault('b', 0));
    }
}
