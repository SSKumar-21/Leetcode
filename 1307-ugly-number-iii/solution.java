class Solution {

    public int nthUglyNumber(int n, int a, int b, int c) {

        long ab = lcm(a, b);
        long ac = lcm(a, c);
        long bc = lcm(b, c);
        long abc = lcm(ab, c);

        long left = 1;
        long right = 2_000_000_000L;

        while (left < right) {

            long mid = left + (right - left) / 2;

            if (count(mid, a, b, c, ab, ac, bc, abc) >= n) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return (int) left;
    }

    private long count(long x,
                       int a, int b, int c,
                       long ab, long ac, long bc, long abc) {

        return (x / a)
             + (x / b)
             + (x / c)
             - (x / ab)
             - (x / ac)
             - (x / bc)
             + (x / abc);
    }

    private long lcm(long x, long y) {
        return (x * y) / gcd(x, y);
    }

    private long gcd(long a, long b) {

        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}
