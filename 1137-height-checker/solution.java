class Solution {
    public int heightChecker(int[] heights) {
        int[] temp = new int[101];
        int[] expected = new int[heights.length];
        Arrays.fill(temp, 0); 

        for(int i=0;i<heights.length;i++){
            temp[heights[i]]++;
        }

        int index=0;
        for (int i = 0; i < 101; i++) {
            while (temp[i] > 0) {
                expected[index++] = i;
                temp[i]--;
                }    
            }

        int res=0;
        
        for(int i=0;i<heights.length;i++){
            if(heights[i] != expected[i]){
                res++;
            }
        }
        return res;
    }
}
