package easy.maximum69number;

//Given a positive integer num consisting only of digits 6 and 9.
//Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).
public class Solution {

//  Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum 69 Number.
//  Memory Usage: 35.6 MB, less than 93.04% of Java online submissions for Maximum 69 Number.

  public int maximum69Number(int num) {
    int highestPositionOf6 = -1;
    int basicValue = num;
    int i = 0;
    while (basicValue != 0) {
      int currentNum = basicValue % 10;
      basicValue = basicValue / 10;
      if (currentNum == 6) {
        highestPositionOf6 = i;
      }
      i++;
    }
    if (highestPositionOf6 != -1) {
      return (int) Math.pow(10, highestPositionOf6) * 3 + num;
    } else {
      return num;
    }
  }
//  Runtime: 4 ms, faster than 34.85% of Java online submissions for Maximum 69 Number.
//  Memory Usage: 35.9 MB, less than 54.27% of Java online submissions for Maximum 69 Number.

//  public int maximum69Number (int num) {
//    String s = String.valueOf(num);
//    if (s.contains("6")) {
//      String result = s.replaceFirst("6", "9");
//      return Integer.parseInt(result);
//    } else {
//      return num;
//    }
//  }
}
