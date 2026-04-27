class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int res = 0;
        int i,j;
        for( i=0;i<arr.length;i++){
            int sum = 0;
            for(j=i ;j<arr.length;j++){
                sum += arr[j];
                if((j - i + 1)%2 != 0) res += sum;
            } 
        }
        return res;
    }
}
