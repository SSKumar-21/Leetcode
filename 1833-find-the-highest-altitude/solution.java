class Solution {
    public int largestAltitude(int[] gain) {
        int res = 0;
        int sum = 0;
        for (int ele : gain){
            sum += ele;
            res = Math.max(sum, res);
        }
        return res;
    }
}
