package leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * https://leetcode.com/problems/unique-number-of-occurrences/
 * Date: 2022-04-04
 */
public class Q1207_unique_number_of_occurrences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        long count = map.values()
                .stream()
                .distinct()
                .count();

        return map.size() == count;
    }

    @DisplayName("test")
    @Test
    void test() {
        assertThat(uniqueOccurrences(new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0})).isTrue();
    }
}

