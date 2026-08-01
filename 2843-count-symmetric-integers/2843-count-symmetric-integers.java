class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int res = 0;
        for (int i = low; i <= high; i++) {
            res += check(i);
        }
        return res;
    }

    private int check(int n) {
        String s = String.valueOf(n);

        if (s.length() % 2 != 0)
            return 0;

        int mid = s.length() / 2;
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < mid; i++) {
            leftSum += s.charAt(i) - '0';
            rightSum += s.charAt(mid + i) - '0';
        }

        if (leftSum == rightSum)
            return 1;
        return 0;

    }
}