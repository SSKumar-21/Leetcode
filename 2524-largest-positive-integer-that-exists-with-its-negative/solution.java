class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele : nums){
            if(ele < 0){
                set.add(ele*-1);
            }
        }
        int res = -1; 
        for(int ele : nums){
            if(ele > 0){
                if(set.contains(ele) && res<ele){
                    res = ele;
                }
            }
        }
        return res;
    }
}
