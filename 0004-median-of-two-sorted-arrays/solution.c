double findMedianSortedArrays(int* nums1, int nums1Size, int* nums2, int nums2Size) {
    double sum = 0;
    int i = 0, j = 0, k = 0;
    int res[nums1Size + nums2Size];
    while (i < nums1Size && j < nums2Size) {
        if (nums1[i] < nums2[j]) {
            res[k++] = nums1[i++];
        } else {
            res[k++] = nums2[j++];
        }
    }

    while (i < nums1Size) {
        res[k++] = nums1[i++];
    }

    while (j < nums2Size) {
        res[k++] = nums2[j++];
    }

    if (k % 2 != 0) {
        sum = res[k / 2];
    } else {
        sum = (res[k / 2] + res[(k / 2) - 1]) / 2.0;
    }
    
    return sum;
}
