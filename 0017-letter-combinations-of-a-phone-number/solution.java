class Solution {
    
    public List<String> letterCombinations(String digits) {
        
        List<String> res = new ArrayList<>();
        
        if (digits == null || digits.length() == 0) return res;

        HashMap<String, String> keypad = new HashMap<>();

        keypad.put("2", "abc");
        keypad.put("3", "def");
        keypad.put("4", "ghi");
        keypad.put("5", "jkl");
        keypad.put("6", "mno");
        keypad.put("7", "pqrs");
        keypad.put("8", "tuv");
        keypad.put("9", "wxyz");

        comb(digits, keypad, res, 0, "");

        return res;

    }

   private void comb(String digits, Map<String, String> letter, List<String> res, int index, String str) {
        if (index == digits.length()) {
            res.add(str);
            return;
        }

        String l = letter.get(String.valueOf(digits.charAt(index)));

        for (int i = 0; i < l.length(); i++) {
            comb(digits, letter, res, index + 1, str + l.charAt(i));
        }
    }
}
