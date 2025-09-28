class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        for(int ele : nums1){
            set1.add(ele);
        }

        HashSet<Integer> set2 = new HashSet<>();
        for(int ele : nums2){
            set2.add(ele);
        }

        int[] res = new int[2];
        int ans1 = 0, ans2 = 0;
        for(int ele: nums1){
            if(set2.contains(ele)){
                ans1++;
            }
        }
        for(int ele: nums2){
            if(set1.contains(ele)){
                ans2++;
            }
        }
        res[0] = ans1;
        res[1] = ans2;
        return res;
    }
}
