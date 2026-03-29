class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        while(left<=right){
            mid = (right - left)/2 + left;
            if(nums[mid] == target) return mid;
            else if (nums[mid] > target) right = mid - 1;
            else left = mid + 1;
        }
        return (target > nums[mid]) ? mid + 1 : mid;
    }
}
