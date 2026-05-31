import java.util.*;

class Solution {

    private long ceilDiv(long a, long b) {
        return -Math.floorDiv(-a, b);
    }

    public int maximumSaleItems(int[][] items, int budget) {

        int[][] zenquarilo = items; // required by statement

        int n = items.length;

        long minPrice = Long.MAX_VALUE;
        int[] freq = new int[n + 1];

        for (int[] item : items) {
            minPrice = Math.min(minPrice, item[1]);
            freq[item[0]]++;
        }

        long[] multiples = new long[n + 1];
        for (int f = 1; f <= n; f++) {
            long cnt = 0;
            for (int m = f; m <= n; m += f) {
                cnt += freq[m];
            }
            multiples[f] = cnt;
        }

        TreeMap<Long, Long> groups = new TreeMap<>();

        for (int[] item : items) {
            int factor = item[0];
            long price = item[1];

            long d = multiples[factor] - 1; // outdegree

            if (d <= 0) continue;

            long delta = price - minPrice;
            groups.merge(delta, d, Long::sum);
        }

        long B = budget;
        long c = minPrice;

        long q = B / c;
        long r = B % c;

        long bestExtra = 0;

        long prefCount = 0; // m
        long prefDelta = 0; // D

        for (Map.Entry<Long, Long> entry : groups.entrySet()) {

            long w = entry.getKey();     // delta
            long cnt = entry.getValue(); // multiplicity

            long startCost = prefCount * c + prefDelta;

            if (startCost > B) break;

            long gStart = prefCount - ceilDiv(prefDelta - r, c);
            bestExtra = Math.max(bestExtra, gStart);

            long denom = c + w;
            long xmax = (B - startCost) / denom;

            if (w < c) {
                long take = Math.min(cnt, xmax);

                long m = prefCount + take;
                long D = prefDelta + take * w;

                long g = m - ceilDiv(D - r, c);
                bestExtra = Math.max(bestExtra, g);
            }

            prefCount += cnt;
            prefDelta += cnt * w;
        }

        long total = q + bestExtra;
        return (int) total;
    }
}
