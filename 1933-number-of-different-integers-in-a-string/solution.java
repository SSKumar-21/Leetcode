class Solution {
    private String removeLeadingZeros(String str) {
        int i = 0;
        while (i < str.length() && str.charAt(i) == '0') {
            i++;
        }
        return i == str.length() ? "0" : str.substring(i);
    }

    public int numDifferentIntegers(String word) {
        HashSet<String> set = new HashSet<>();
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            if (Character.isDigit(word.charAt(i))) {
                temp.append(word.charAt(i));
            } else {
                if (temp.length() > 0) {
                    set.add(removeLeadingZeros(temp.toString()));
                    temp.setLength(0);
                }
            }
        }

        if (temp.length() > 0) {
            set.add(removeLeadingZeros(temp.toString()));
        }

        return set.size();
    }
}

