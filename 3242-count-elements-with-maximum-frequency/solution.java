class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] arr = new int[100];

        for(int i=0;i<100;i++){
            arr[i] = 0;
        }
        int max = 0;
        for(int ele: nums){
            arr[ele-1]++;
            if(arr[ele-1] > max){
                max = arr[ele - 1];
            }
        }
        int res = 0;
        for(int i=0;i<100;i++){
            if(max == arr[i]){
                res+=arr[i];
            }
        }
        return res;
    }
}
