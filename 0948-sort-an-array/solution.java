class Solution {
    public int[] sortArray(int[] nums) {
        int min = Integer.MAX_VALUE ;
        int max = Integer.MIN_VALUE ;

        for(int ele : nums){
            min = Math.min(ele, min);
            max = Math.max(ele, max);
        }

        int[] freq = new int[max - min + 1];

        for(int ele : nums){
            freq[ele - min]++;
        }
        int index = 0;
        for(int i = 0;i<freq.length;i++){
            while(freq[i]>0){
                nums[index++] = i + min;
                freq[i]--;
            }
        }
        return nums;
    }
}
