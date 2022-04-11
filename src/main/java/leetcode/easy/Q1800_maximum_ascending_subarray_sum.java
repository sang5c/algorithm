package leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * https://leetcode.com/problems/maximum-ascending-subarray-sum/
 * Date: 2022-04-11
 */
public class Q1800_maximum_ascending_subarray_sum {
    public int maxAscendingSum(int[] nums) {
        int maxSum = 0;
        int before = nums[0];
        int sum = before;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= before) {
                maxSum = Math.max(maxSum, sum);

                sum = 0;
            }
            sum += nums[i];
            before = nums[i];
        }

        return Math.max(maxSum, sum);
    }

    @DisplayName("test")
    @Test
    void test() {
        assertThat(maxAscendingSum(new int[]{12, 17, 15, 13, 10, 11, 12})).isEqualTo(33);
    }
}
