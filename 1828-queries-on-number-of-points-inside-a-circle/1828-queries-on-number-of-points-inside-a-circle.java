class Solution {
    public int[] countPoints(int[][] points, int[][] q) {
        int circle = q.length;
        int[] res = new int[circle];

        for (int i = 0; i < circle; i++) {
            int x = q[i][0];
            int y = q[i][1];
            int r = q[i][2];
            int ans = 0;
            for (int j = 0; j < points.length; j++) {
                int x_ = points[j][0];
                int y_ = points[j][1];

                double X = Math.pow(x - x_, 2);
                double Y = Math.pow(y - y_, 2);
                double dis = Math.sqrt(X + Y);

                if (dis <= r)
                    ans++;
            }
            res[i] = ans;
        }
        return res;
    }
}