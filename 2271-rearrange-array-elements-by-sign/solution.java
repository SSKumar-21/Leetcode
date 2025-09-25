class Solution {
    public int[] rearrangeArray(int[] nums) {
        int i = 0;
        int j = 0;

            while(i<nums.length && nums[i] < 0){
                i++;
            }



            while(j<nums.length && nums[j] > 0){
                j++;
            }

        int k = 0;
        int check = 0;

        int[] res = new int[nums.length];

        while(k<nums.length){
            if(check%2==0){
                res[k] = nums[i++];
                while(i<nums.length && nums[i] < 0){
                    i++;
                }
            } else {
                res[k] = nums[j++];
                while(j<nums.length && nums[j] > 0){
                    j++;
                }
            }
            k++;
            check++;
        }
        return res;
    }
}
