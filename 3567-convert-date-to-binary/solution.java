class Solution {
    public String convertDateToBinary(String date) {
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));
        String res = Integer.toBinaryString(year)+'-'+Integer.toBinaryString(month)+'-'+Integer.toBinaryString(day);
        return res;
    }
}
