class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int res =0 ;
        for(int ele: hours) if (ele >= target) res++;
        return res;
    }
}
