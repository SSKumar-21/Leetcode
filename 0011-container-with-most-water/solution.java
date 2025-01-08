class Solution {
    public int maxArea(int[] height) {
      int max=0;
      int l=0,r=height.length -1;
      while(l<r){
        int h= (height[l]>height[r])? height[r] : height[l];
        int area=(r-l)*h;
        if(max<area){
            max=area;
        }
        if(height[l]>height[r]){
            r--;
        } else{
            l++;
        }
      }  
      return max;
    }
}
