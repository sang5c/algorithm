package leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/two-sum/
 */
class Solution {
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
        Solution solution = new Solution();
        int[] result = solution.twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

}
