class Solution {
    public int countBeautifulPairs(int[] nums) {
        int res =0;
        for(int i=0;i<nums.length ;i++){
            String first = nums[i] + "";
            int f = first.charAt(0) - '0';
            for (int j=i+1;j<nums.length;j++){
                String last = nums[j] + "";
                int l = last.charAt(last.length()-1) - '0';
                if (Gcd(f,l) == 1){
                    res++;
                }
            }
        }
        return res;
    }
    private int Gcd(int a , int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}
