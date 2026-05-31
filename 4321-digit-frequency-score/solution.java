class Solution {
    public int digitFrequencyScore(int n) {
        int[] freq = new int[10] ;
        while(n>0){
            freq[n%10]++;
            n/=10;
        }
        int res = 0;
        for(int i = 0;i<=9;i++){
            res+=i * freq[i];
        }
        return res;
    }
}
