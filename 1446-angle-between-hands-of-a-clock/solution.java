class Solution {
    public double angleClock(int h, int m) {
        double angle = Math.abs((30* h) - (5.5 * m));
        return angle > 180 ? 360 - angle : angle ;
    }
}
