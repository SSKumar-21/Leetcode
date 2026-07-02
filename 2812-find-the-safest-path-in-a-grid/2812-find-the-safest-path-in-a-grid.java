import java.util.*;

class Solution {
    // Direction vectors for moving up, down, left, and right
    private static final int[][] DIRS = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public int maximumSafenessFactor(List<List<Integer>> grid) {
        int n = grid.size();
        
        // Edge cases: start or end contains a thief
        if (grid.get(0).get(0) == 1 || grid.get(n - 1).get(n - 1) == 1) {
            return 0;
        }

        int[][] distToThief = new int[n][n];
        for (int[] row : distToThief) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        Queue<int[]> bfsQueue = new LinkedList<>();

        // Step 1: Initialize Multi-source BFS with all thief locations
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (grid.get(r).get(c) == 1) {
                    bfsQueue.offer(new int[]{r, c});
                    distToThief[r][c] = 0;
                }
            }
        }

        // Populate minimum distance to any thief for each cell
        while (!bfsQueue.isEmpty()) {
            int[] curr = bfsQueue.poll();
            int r = curr[0];
            int c = curr[1];

            for (int[] dir : DIRS) {
                int nr = r + dir[0];
                int nc = c + dir[1];

                if (nr >= 0 && nr < n && nc >= 0 && nc < n && distToThief[nr][nc] == Integer.MAX_VALUE) {
                    distToThief[nr][nc] = distToThief[r][c] + 1;
                    bfsQueue.offer(new int[]{nr, nc});
                }
            }
        }

        // Step 2: Dijkstra's Algorithm to find the maximum safeness path
        // Priority Queue stores [safeness_factor, row, col], sorted by safeness descending
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(b[0], a[0]));
        boolean[][] visited = new boolean[n][n];

        maxHeap.offer(new int[]{distToThief[0][0], 0, 0});
        visited[0][0] = true;

        while (!maxHeap.isEmpty()) {
            int[] curr = maxHeap.poll();
            int maxSafeness = curr[0];
            int r = curr[1];
            int c = curr[2];

            // Reached the destination
            if (r == n - 1 && c == n - 1) {
                return maxSafeness;
            }

            for (int[] dir : DIRS) {
                int nr = r + dir[0];
                int nc = c + dir[1];

                if (nr >= 0 && nr < n && nc >= 0 && nc < n && !visited[nr][nc]) {
                    visited[nr][nc] = true;
                    // The safeness of the path is limited by the bottleneck cell
                    int nextSafeness = Math.min(maxSafeness, distToThief[nr][nc]);
                    maxHeap.offer(new int[]{nextSafeness, nr, nc});
                }
            }
        }

        return 0;
    }
}