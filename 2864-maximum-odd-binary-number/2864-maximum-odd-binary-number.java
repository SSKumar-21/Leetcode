class Solution {
    public String maximumOddBinaryNumber(String s) {
        int n = s.length();
        int one = 0;
        int z = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1')
                one++;
            else
                z++;
        }
        one--;
        String res = "1";
        while (z != 0) {
            res = "0" + res;
            z--;
        }
        while (one != 0) {
            res = "1" + res;
            one--;
        }
        return res;
    }
}