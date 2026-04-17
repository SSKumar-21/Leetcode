class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {

        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int rem = sum % k;
            if(rem == 0 && i+1 >= 2){
                return true;
            }
            if(map.containsKey(rem)){
                int index = map.get(rem);
                if(i - index >= 2){
                    return true;
                }
            } else {
                map.put(rem, i);
            }
        }
        return false;
    }
}
