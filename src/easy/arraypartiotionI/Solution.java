package easy.arraypartiotionI;

import java.util.Arrays;

/*
Given an integer array nums of 2n integers, group these integers into n pairs (a1, b1), (a2, b2), ..., (an, bn)
such that the sum of min(ai, bi) for all i is maximized. Return the maximized sum.
 */
class Solution {
    //    Runtime: 10 ms, faster than 96.88% of Java online submissions for Array Partition I.
    //    Memory Usage: 41.1 MB, less than 54.20% of Java online submissions for Array Partition I.
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int maximizedSum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            maximizedSum += nums[i];
        }
        return maximizedSum;

    }
}
