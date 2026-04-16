class Solution {
    public int maxArea(int[] height) {
        int  i=0 ;
        int j= height.length -1;
        int area = 0;
        while(i<j){
            int dis = j -i;
            int sh = Math.min(height[i],height[j]);
            area = Math.max(area,dis * sh);
            if(sh == height[i]){
                i++;
            } else {
                j--;
            }
        }
        return area;
    }
}
