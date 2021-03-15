package easy.minimum_time_visiting_all_points;

class Solution {
//    Runtime: 0 ms, faster than 100.00% of Java online submissions for Minimum Time Visiting All Points.
//    Memory Usage: 38.5 MB, less than 69.98% of Java online submissions for Minimum Time Visiting All Points.

    public int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;
        for (int i = 0; i < points.length - 1; i++) {
            time += Math.max(Math.abs(points[i][0] - points[i + 1][0]), Math.abs(points[i][1] - points[i + 1][1]));
        }
        return time;
    }
}
