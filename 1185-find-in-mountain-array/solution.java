/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length() ;
        if(n<3) return -1;
        int peak;
        int l=0;
        int r = n-1;
        int arr_mid;
        int mid = -1;

        while(l<=r){
            mid = l + (r-l)/2 ; 
            arr_mid = mountainArr.get(mid);
            int mid1 = mountainArr.get(mid+1);
            int mid_1 = mountainArr.get(mid-1);
            if( arr_mid > mid1 && arr_mid> mid_1){
                break;
            } else if(arr_mid < mid1){
                l = mid ;
            } else {
                r = mid;
            }
        }

        int peakIndex = mid; 

        l=0;
        r=peakIndex;
        while(l<=r){
            mid = l + (r-l)/2 ;
            arr_mid = mountainArr.get(mid);
            if(arr_mid == target){
                return mid;
            } else if (arr_mid > target){
                r = mid -1;
            } else {
                l=mid +1;
            }
        }

        r=n-1;
        l=peakIndex;
        while(l<=r){
            mid = l + (r-l)/2 ;
            arr_mid = mountainArr.get(mid);
            if(arr_mid == target){
                return mid;
            } else if (arr_mid > target){
                l=mid +1;
            } else {
                r = mid -1;
            }
        }
        return -1 ;
    }
}
