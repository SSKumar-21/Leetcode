class Solution {

    public int uniquePathsIII(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] v = new boolean[m][n];
        int I = 0;
        int J = 0;
        int z = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    I = i;
                    J = j;
                } else if (grid[i][j] == 0) {
                    z++;
                } else if (grid[i][j] == -1) {
                    v[i][j] = true;
                }
            }
        }
        System.out.print(z);
        return solve(I, J, m, n, grid, v, z);

    }

    private int solve(int i, int j, int m, int n, int[][] grid, boolean[][] v, int z) {
        if (i >= m || j >= n || i < 0 || j < 0) {
            return 0;
        }
        if (grid[i][j] == 2) {
            return z == 0 ? 1 : 0;
        }
        if (v[i][j]) {
            return 0;
        }
        if (v[i][j])
            return 0;

        v[i][j] = true;

        if (grid[i][j] == 0)
            z--;

        int res = solve(i + 1, j, m, n, grid, v, z)
                + solve(i - 1, j, m, n, grid, v, z)
                + solve(i, j + 1, m, n, grid, v, z)
                + solve(i, j - 1, m, n, grid, v, z);

        v[i][j] = false;

        return res;
    }
}