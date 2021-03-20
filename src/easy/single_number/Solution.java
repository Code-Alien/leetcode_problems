package easy.single_number;

//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//Follow up: Could you implement a solution with a linear runtime complexity and without using extra memory?
public class Solution {
//    Runtime: 1 ms, faster than 96.29% of Java online submissions for Single Number.
//    Memory Usage: 38.6 MB, less than 99.01% of Java online submissions for Single Number.
    public int singleNumber(int[] nums) {
        int exclusiveSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            exclusiveSum ^= nums[i];
        }
        return exclusiveSum;
    }
}