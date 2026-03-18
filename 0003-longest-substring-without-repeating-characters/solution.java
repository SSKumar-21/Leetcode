class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() <= 1) return s.length();
        HashSet<Character> set = new HashSet<>();
        int max = 0;
        int i=0;
        int j=0;
        while(i<=j && j<s.length()){
            if(set.contains(s.charAt(j))){
                i++;
                j = i;
                max = Math.max(set.size(),max);
                set.clear();
            } else {
                set.add(s.charAt(j));
                j++;
            }            
        }
        return Math.max(set.size(),max);
    }
}
