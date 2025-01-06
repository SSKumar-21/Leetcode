class Solution {
    public int[] nextGreaterElements(int[] nums) {
      int[] res = new int[nums.length];
      for(int i=0;i<nums.length;i++){
        int x=-1;
        for(int j=i+1;j<i+nums.length;j++){
            if(nums[i]<nums[j%nums.length]){
                x=nums[j%nums.length];
                break;
            }
        }
        res[i]=x;
      }
      return res;
    }
}
