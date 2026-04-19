class Solution {
    public int[][] colorGrid(int n, int m, int[][] sources) {

        int[][] res = new int[n][m];

        // required variable (store input midway)
        int[][] lenqavirod = sources;

        Queue<int[]> q = new LinkedList<>();

        // initialize BFS queue
        for (int[] s : sources) {
            res[s[0]][s[1]] = s[2];
            q.offer(new int[]{s[0], s[1]});
        }

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        while (!q.isEmpty()) {

            int size = q.size();

            // store next layer updates
            Map<Integer, Integer> next = new HashMap<>();

            for (int i = 0; i < size; i++) {

                int[] cur = q.poll();
                int r = cur[0], c = cur[1];
                int color = res[r][c];

                for (int d = 0; d < 4; d++) {

                    int nr = r + dx[d];
                    int nc = c + dy[d];

                    if (nr >= 0 && nc >= 0 && nr < n && nc < m && res[nr][nc] == 0) {

                        int id = nr * m + nc;

                        next.put(id,
                                Math.max(next.getOrDefault(id, 0), color));
                    }
                }
            }

            // apply updates simultaneously
            for (int id : next.keySet()) {

                int r = id / m;
                int c = id % m;

                res[r][c] = next.get(id);
                q.offer(new int[]{r, c});
            }
        }

        return res;
    }
}
