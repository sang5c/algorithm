package leetcode.algorithm.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * Date: 2022-03-29
 */
public class Q26_remove_duplicates_from_sorted_array {
    public int removeDuplicates(int[] nums) {
        int indexCount = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[indexCount] = nums[i + 1];
                indexCount++;
            }
        }

        return indexCount;
    }

    @DisplayName("removeDuplicates")
    @Test
    void removeDuplicates() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int removeCount = removeDuplicates(nums);

        assertThat(removeCount).isEqualTo(5);
        assertThat(nums).containsSequence(0, 1, 2, 3, 4);
    }
}
