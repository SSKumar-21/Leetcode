class Solution {
    public int countDaysTogether(String aa, String la, String ab, String lb) {
        return Math.max(0, Math.min(days(la), days(lb)) - Math.max(days(aa), days(ab)) + 1);

    }

    private int days(String d) {
        int[] month = new int[] { 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334 };

        int m = Integer.parseInt(d.substring(0, 2));
        int date = Integer.parseInt(d.substring(3, 5));

        int spent = month[m - 1] + date;
        return spent;
    }
}