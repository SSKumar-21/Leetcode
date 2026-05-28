class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int[] max = new int[n];
        int[] prefixGcd = new int[n];
        max[0] = nums[0];
        for(int i =1 ;i<n;i++){
            max[i] = Math.max(max[i-1],nums[i]);
        }

        for(int i = 0;i<n;i++){
            prefixGcd[i] = GCD(max[i], nums[i]);
        }
        Arrays.sort(prefixGcd);

        long res = 0;

        int l =0 , r = n -1;

        while(l<r){
            res += GCD(prefixGcd[l],prefixGcd[r]);
            l++;
            r--;
        }

        return res;


    }
    private int GCD(int a, int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}
