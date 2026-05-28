class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        int[] freq = new int[100+1];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        for(int i=0;i<nums.length;i++){
            boolean c = true;
            if(freq[nums[i]] > 1){
                for(int j = 2;j < freq[nums[i]]; j++){
                    if(freq[nums[i]] % j == 0) {
                        c = false;
                        break;
                    }
                }
                if (c) {
                    return true;
                }
            }
        }
        return false;
    }
}
