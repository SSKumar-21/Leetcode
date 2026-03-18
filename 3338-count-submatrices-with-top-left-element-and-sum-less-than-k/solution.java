class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int[] col = new int[n];
        int res = 0 ;

        for(int i=0;i<m;i++){
            int row = 0;
            for(int j=0;j<n;j++){
                col[j] += grid[i][j];
                row += col[j];
                if(row <=k){
                    res++;
                }
            }
        }
        return res ;

    }
}
