bool check(int* nums, int numsSize) {
    int c= 0;

    for (int i=0;i<numsSize;i++) {
        if (nums[i]>nums[(i+1)%numsSize]) {
            c++;
        }
    }
    return c<=1;
}
