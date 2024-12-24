class Solution {
    public int trap(int[] height) {
        int i=0,j=height.length-1,max=0;
        while(i<j){
            if(height[i]<height[j]){
                if(height[i+1]<height[i]){
                    max += (height[i]-height[i+1]);
                    height[i+1]=height[i];
                }
                i++;
            } else{
                if(height[j-1]<height[j]){
                    max += (height[j]-height[j-1]);
                    height[j-1]=height[j];
                }
                j--;
            }
        }
        return max;
    }
}
