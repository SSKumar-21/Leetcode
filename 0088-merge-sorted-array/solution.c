void merge(int* nums1, int nums1Size, int m, int* nums2, int nums2Size, int n) {
    int i,j,temp,k=0;
    if(n!=0 && m==0){
       for(i=0;i<n;i++){
           nums1[i]=nums2[i];
       }
   }
   else if(n!=0 && m!=0){
       for (i=m;i<m+n;i++){
       nums1[i]=nums2[k];
       if(k<n){
           k++;
       }
   }

for(i=0;i<m+n;i++){
       for(j=i+1;j<m+n;j++){
           if(nums1[i]>nums1[j]){
           temp=nums1[i];
           nums1[i]=nums1[j];
           nums1[j]=temp;
           }
       }
   }
   }
   else{
       
   }
}
