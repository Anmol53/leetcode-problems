class Solution {
    public double angleClock(int hour, int minutes) {
        double a = Math.abs(30.0 * hour - (11.0 * minutes) / 2.0);
        return Math.min(a, 360 - a);
    }
}