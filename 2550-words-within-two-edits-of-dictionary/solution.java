class Solution {

    public List<String> twoEditWords(String[] queries, String[] dictionary) {

        List<String> res = new ArrayList<>();

        for (int i = 0; i < queries.length; i++) {
            for (int j = 0; j < dictionary.length; j++) {
                int c = countChanges(queries[i], dictionary[j]);
                if (c <= 2) {
                    res.add(queries[i]);
                    break;
                }
            }
        }
        return res;
    }


    private int countChanges(String s1, String s2) {

        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
                if (count > 2) {
                    return count;
                }
            }
        }
        return count;
    }
}
