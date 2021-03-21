package easy.lemonade_change;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lemonadeChange(new int[]{5, 5, 10}));
        System.out.println(solution.lemonadeChange(new int[]{5, 5, 10, 20}));
        System.out.println(solution.lemonadeChange(new int[]{5, 5, 5, 10, 10, 10, 20, 20}));
    }
}
