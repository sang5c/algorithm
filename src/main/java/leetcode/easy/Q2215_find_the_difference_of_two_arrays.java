package leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * https://leetcode.com/problems/find-the-difference-of-two-arrays/
 * Date: 2022-03-29
 */
public class Q2215_find_the_difference_of_two_arrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<Integer> left = Arrays.stream(nums1)
                .distinct()
                .filter(n1 -> notContains(nums2, n1))
                .boxed()
                .toList();

        List<Integer> right = Arrays.stream(nums2)
                .distinct()
                .filter(n2 -> notContains(nums1, n2))
                .boxed()
                .toList();

        return List.of(left, right);
    }

    private boolean notContains(int[] nums2, int n1) {
        return Arrays.stream(nums2)
                .noneMatch(n2 -> n2 == n1);
    }

    @DisplayName("test")
    @Test
    void test() {
        int[] nums1 = {1, 2, 3, 3};
        int[] nums2 = {1, 1, 2, 2};
        List<List<Integer>> result = findDifference(nums1, nums2);
        assertThat(result).containsExactly(List.of(3), List.of());
    }
}
