package easy.greatestcommondivisorofstrings;

public class Main {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.gcdOfStrings("ABCABC", "ABC"));
    System.out.println(solution.gcdOfStrings("ABABAB", "ABAB"));
    System.out.println(solution.gcdOfStrings("LEET", "CODE"));
    System.out.println(solution.gcdOfStrings("ABCDEF", "ABC"));
    System.out.println(solution.gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX",
            "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"));
  }
}
