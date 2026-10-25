class Solution {
    public int closedIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 0)
                    if (solve(grid, i, j, n, m))
                        res++;
            }
        }
        return res;
    }

    private boolean solve(int[][] grid, int i, int j, int n, int m) {
        if (i < 0 || i >= n || j < 0 || j >= m)
            return false;
        if (grid[i][j] == 1)
            return true;

        grid[i][j] = 1;

        boolean left = solve(grid, i - 1, j, n, m);
        boolean right = solve(grid, i + 1, j, n, m);
        boolean top = solve(grid, i, j - 1, n, m);
        boolean bottom = solve(grid, i, j + 1, n, m);

        return left && right && top && bottom;
    }
}