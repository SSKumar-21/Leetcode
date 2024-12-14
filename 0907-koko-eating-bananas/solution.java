class Solution {
    public int minEatingSpeed(int[] piles, int h) {
           int left = 1, right = 1000000000;
        while (left < right) {
            int mid = left + (right - left) / 2, time = 0;
            for (int i : piles) time += (i + mid - 1) / mid;
            if (time > h) left = mid + 1;
            else right = mid;
        }
        return left;
    }
}
