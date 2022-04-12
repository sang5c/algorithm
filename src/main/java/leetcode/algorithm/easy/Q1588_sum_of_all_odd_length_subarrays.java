package leetcode.algorithm.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * https://leetcode.com/problems/sum-of-all-odd-length-subarrays/
 * Date: 2022-04-05
 */
public class Q1588_sum_of_all_odd_length_subarrays {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;

        for (int arrSize = 1; arrSize <= arr.length; arrSize += 2) {
            for (int i = 0; i < arr.length - arrSize + 1; i++) {
                int[] subArr = Arrays.copyOfRange(arr, i, i + arrSize);
                sum += arrSum(subArr);
            }
        }

        return sum;
    }

    private int arrSum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    @DisplayName("test")
    @Test
    void test() {
        assertThat(sumOddLengthSubarrays(new int[]{1, 4, 2, 5, 3})).isEqualTo(58);
    }
}

