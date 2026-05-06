class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> set = new HashSet<>();
        for (String s : banned)
            set.add(s.toLowerCase());
        int max = 0;
        String word = "";
        HashMap<String, Integer> map = new HashMap<>();
        String[] para = paragraph.toLowerCase().replaceAll("[^a-z\\s]", " ").split("\\s+");
        for (String s : para) {
            if (!set.contains(s)) {
                int f = map.getOrDefault(s, 0) + 1;
                map.put(s, f);
                if (f > max) {
                    word = s;
                    max = f;
                }
            }
        }
        return word;
    }
}
