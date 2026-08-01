class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            while (a != 0) {
                if ((a % 10) == digit)
                    res++;
                a /= 10;
            }
        }
        return res;
    }
}