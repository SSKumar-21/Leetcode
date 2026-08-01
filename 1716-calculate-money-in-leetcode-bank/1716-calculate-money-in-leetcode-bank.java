class Solution {
    public int totalMoney(int n) {
        int res = 0;
        int week = 1;
        int day = 0;
        for (int i = 0; i < n; i++) {
            res += week + day;
            day++;

            if (day == 7) {
                day = 0;
                week++;
            }
        }
        return res;
    }
}