class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> res = new ArrayList<>();

        int n = p.length();
        int m = s.length();

        if (n > m) return res;

        int[] pCount = new int[26];
        int[] windowCount = new int[26];

        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }

        int i = 0, j = 0;

        while (j < m) {
            windowCount[s.charAt(j) - 'a']++;
            if (j - i + 1 == n) {

                if (Arrays.equals(pCount, windowCount)) {
                    res.add(i);
                }
                windowCount[s.charAt(i) - 'a']--;
                i++;
            }

            j++;
        }

        return res;
    }
}
