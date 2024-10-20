/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
bool* kidsWithCandies(int* candies, int candiesSize, int extraCandies, int* returnSize) {
    int max=candies[0];
    bool *res = (bool*)malloc(candiesSize * sizeof(bool));
    
    for(int i=0;i<candiesSize;i++){
        if(max<candies[i]){
            max=candies[i];
        }
    }
    
   for(int i=0;i<candiesSize;i++){
       int sum=candies[i]+extraCandies;
       res[i]=(max<=sum);
   }
   
   *returnSize = candiesSize;
   return res;
}
