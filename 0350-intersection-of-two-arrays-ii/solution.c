/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* intersect(int* nums1, int nums1Size, int* nums2, int nums2Size, int* returnSize) {
    int *res = malloc((nums1Size + nums2Size) * sizeof(int)); 
    int check[2001]={0};
    *returnSize=0;
    int i,x=0;
    for(i=0;i<nums1Size;i++){
        check[nums1[i]+1000]++; 
    }
    for(i=0;i<nums2Size;i++){
        if(check[nums2[i]+1000]){
            res[x++]=nums2[i];
            check[nums2[i]+1000]--;
            (*returnSize)++;
        }
    }
    return res;
}
