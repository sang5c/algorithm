package leetcode.algorithm.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/two-sum/
 * Date: 2020-09-04
 */
public class Q1_two_sum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("fail");
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        Q1_two_sum solution = new Q1_two_sum();
        int[] result = solution.twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

}
