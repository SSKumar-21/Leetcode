import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null || s.length()==0) {
            return 0;
        }

        HashSet<Character> set = new HashSet<>();
        int max=0;
        int left=0;
        for (int right=0;right<s.length();right++) {
            char curr=s.charAt(right);

            while (set.contains(curr)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(curr);
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}

