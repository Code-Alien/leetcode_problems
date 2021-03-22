package medium.powerfull_integers;

import java.util.ArrayList;
import java.util.List;

//Given three integers x, y, and bound, return a list of all the powerful integers that have a value less than or equal to bound.
//An integer is powerful if it can be represented as x^i + y^j for some integers i >= 0 and j >= 0.
//You may return the answer in any order. In your answer, each value should occur at most once.
class Solution {

//    Runtime: 1 ms, faster than 93.18% of Java online submissions for Powerful Integers.
//    Memory Usage: 36.9 MB, less than 49.55% of Java online submissions for Powerful Integers.
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        List<Integer> result = new ArrayList<>();
        for (int currX = 1; ; currX *= x) {
            for (int currY = 1; ; currY *= y) {
                int tmp = currX + currY;
                if (tmp <= bound && !result.contains(tmp)) {
                    result.add(tmp);
                } else if (tmp > bound) {
                    if (currY == 1) {
                        return result;
                    } else {
                        break;
                    }
                }
                if (y == 1) {
                    break;
                }
            }
            if (x == 1) {
                break;
            }
        }
        return result;
    }
}
