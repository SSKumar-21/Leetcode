class Solution {
    public int minElement(int[] nums) {
        int res = Integer.MAX_VALUE;

        for(int ele: nums){
            res = Math.min(res, sum(ele));
        }
        return res;
    }
    private int sum(int x){
        int res = 0;
        while(x!=0){
            res += x%10;
            x /= 10;
        }
        return res;
    }
}
