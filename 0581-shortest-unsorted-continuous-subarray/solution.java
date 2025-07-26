class Solution {
    public int findUnsortedSubarray(int[] nums) {
        if(nums.length == 1){
            return 0;
        }

        int[] arr = new int[nums.length];
        System.arraycopy(nums, 0, arr, 0, nums.length);
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length -1 ;
        while(i<nums.length && arr[i] == nums[i]) i++ ;
        if (i==nums.length){
            return 0;
        }
        while(j>=0 && arr[j] == nums[j]) j--;
        
        return Math.abs(j-i+1);
    }
}
