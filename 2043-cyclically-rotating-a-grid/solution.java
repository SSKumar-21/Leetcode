class Solution {

    private ArrayList<Integer> getLayer(int[][] grid,int top,int bottom,int left,int right) {

        ArrayList<Integer> vals = new ArrayList<>();

        for(int j = left; j <= right; j++) {
            vals.add(grid[top][j]);
        }

        for(int i = top + 1; i <= bottom - 1; i++) {
            vals.add(grid[i][right]);
        }

        for(int j = right; j >= left; j--) {
            vals.add(grid[bottom][j]);
        }

        for(int i = bottom - 1; i >= top + 1; i--) {
            vals.add(grid[i][left]);
        }

        return vals;
    }

    private ArrayList<Integer> rotate(ArrayList<Integer> vals,int k) {

        int sz = vals.size();

        k %= sz;

        ArrayList<Integer> rotated = new ArrayList<>();

        for(int i = 0; i < sz; i++) {
            rotated.add(vals.get((i + k) % sz));
        }

        return rotated;
    }

    private void fillLayer(int[][] grid,int top,int bottom,int left,int right,ArrayList<Integer> vals) {

        int idx = 0;

        for(int j = left; j <= right; j++) {
            grid[top][j] = vals.get(idx++);
        }

        for(int i = top + 1; i <= bottom - 1; i++) {
            grid[i][right] = vals.get(idx++);
        }

        for(int j = right; j >= left; j--) {
            grid[bottom][j] = vals.get(idx++);
        }

        for(int i = bottom - 1; i >= top + 1; i--) {
            grid[i][left] = vals.get(idx++);
        }
    }

    public int[][] rotateGrid(int[][] grid,int k) {

        int m = grid.length;
        int n = grid[0].length;

        int layers = Math.min(m,n) / 2;

        for(int layer = 0; layer < layers; layer++) {

            int top = layer;
            int left = layer;

            int bottom = m - layer - 1;
            int right = n - layer - 1;

            ArrayList<Integer> vals = getLayer(grid,top,bottom,left,right);

            ArrayList<Integer> rotated = rotate(vals,k);

            fillLayer(grid,top,bottom,left,right,rotated);
        }

        return grid;
    }
}
