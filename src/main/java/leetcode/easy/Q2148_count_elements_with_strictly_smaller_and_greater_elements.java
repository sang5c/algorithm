package leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * https://leetcode.com/problems/count-elements-with-strictly-smaller-and-greater-elements/
 * Date: 2022-03-30
 */
public class Q2148_count_elements_with_strictly_smaller_and_greater_elements {
    public int countElements(int[] nums) {
        return (int) Arrays.stream(nums)
                .filter(i -> notMinOrMax(nums, i))
                .count();
    }

    private boolean notMinOrMax(int[] nums, int target) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        return min != target && max != target;
    }

    @DisplayName("test")
    @Test
    void test() {
        int[] nums = {11, 7, 2, 15};
        assertThat(countElements(nums)).isEqualTo(2);
    }
}
