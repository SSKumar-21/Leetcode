// class Solution {
//     public int findClosest(int x, int y, int z) {
//         if (Math.abs(z-y) > Math.abs(z-x)) return 1;
//         else if (Math.abs(z-y) < Math.abs(z-x)) return 2;
//         return 0;
//     }
// }

class Solution {
    public int findClosest(int x, int y, int z) {
        int dx = Math.abs(z - x);
        int dy = Math.abs(z - y);
        if (dx == dy) {
            return 0;
        } else if (dx > dy) {
            return 2;
        } else {
            return 1;
        }
    }
}
