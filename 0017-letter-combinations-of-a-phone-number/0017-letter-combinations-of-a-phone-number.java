class Solution {
    Map<Character, String> map = new HashMap<>();

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        solve(digits, "",res, 0);
        return res;
    }

    private void solve(String d, String str, List<String> res, int idx) {
        if (idx >= d.length()) {
            res.add(str);
            return;
        }
        String ch = map.get(d.charAt(idx));

        for (int i = 0; i < ch.length(); i++) {
            solve(d, str + ch.charAt(i), res, idx + 1);
        }
    }
}