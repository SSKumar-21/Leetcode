import java.util.*;

class Solution {
    public int minimumHammingDistance(int[] source, int[] target, int[][] allowedSwaps) {

        int n = source.length;

        // build graph
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());

        for (int[] e : allowedSwaps) {
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }

        boolean[] visited = new boolean[n];
        int res = 0;

        // process each component
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {

                List<Integer> indices = new ArrayList<>();
                dfs(i, adj, visited, indices);

                // count values in this component
                Map<Integer, Integer> freq = new HashMap<>();
                for (int idx : indices) {
                    freq.put(source[idx], freq.getOrDefault(source[idx], 0) + 1);
                }

                // match with target
                for (int idx : indices) {
                    if (freq.getOrDefault(target[idx], 0) > 0) {
                        freq.put(target[idx], freq.get(target[idx]) - 1);
                    } else {
                        res++;
                    }
                }
            }
        }

        return res;
    }

    private void dfs(int node, List<List<Integer>> adj, boolean[] visited, List<Integer> indices) {
        visited[node] = true;
        indices.add(node);

        for (int nei : adj.get(node)) {
            if (!visited[nei]) {
                dfs(nei, adj, visited, indices);
            }
        }
    }
}
