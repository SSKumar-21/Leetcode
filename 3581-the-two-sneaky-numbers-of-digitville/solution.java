class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int index=0;
        int[] arr;
        arr= new int[2];
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                arr[index++]=nums[i];
            }
            else{
                set.add(nums[i]);
            }
        }
        return arr;
    }
}
