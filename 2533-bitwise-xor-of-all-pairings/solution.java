class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int res=0;
        if(n%2!=0){
            for(int ele : nums2){
                res^=ele;
            }
        }
        n=nums2.length;
        if(n%2!=0){
            for(int ele : nums1){
                res^=ele;
            }
        }
        return res;
    }
}
