package easy.minimum_time_visiting_all_points;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minTimeToVisitAllPoints(new int[][]{{1, 1}, {3, 4}, {-1, 0}}));
        System.out.println(solution.minTimeToVisitAllPoints(new int[][]{{3, 2}, {-2, 2}}));
    }
}
