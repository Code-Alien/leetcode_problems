package easy.greatest_common_divisor_of_strings;


import java.util.HashSet;
import java.util.Set;

//For two strings s and t, we say "t divides s" if and only if s = t + ... + t  (t concatenated with itself 1 or more times)
//Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
class Solution {
  //  Runtime: 3 ms, faster than 27.00% of Java online submissions for Greatest Common Divisor of Strings.
//  Memory Usage: 39 MB, less than 66.00% of Java online submissions for Greatest Common Divisor of Strings.
  public String gcdOfStrings(String str1, String str2) {
    Set<String> divisors = new HashSet<>();
    String gcd = "";
    divisors.add(str1);
    int len = str1.length();
    for (int i = 1; i < len; i += 1) {
      if (len % i != 0) {
        continue;
      }
      String substr = str1.substring(0, i);
      if (!str2.contains(substr)) {
        continue;
      }
      boolean isDivisor = true;
      for (int j = 0; j + i <= len; j += i) {
        if (!substr.equals(str1.substring(j, j + i))) {
          isDivisor = false;
          break;
        }
      }
      if (isDivisor) {
        boolean isCommon = true;
        for (int l = 0; l + substr.length() <= str2.length(); l += substr.length()) {
          if (!substr.equals(str2.substring(l, l + str2.length()))) {
            isCommon = false;
            break;
          }
        }
        if (isCommon) {
          gcd = substr;
        }
      }
    }
    return gcd;
  }

}
