package leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * https://leetcode.com/problems/maximum-score-after-splitting-a-string/
 * Date: 2022-03-31
 */
public class Q1422_maximum_score_after_splitting_a_string {
    public int maxScore(String s) {
        int max = 1;

        for (int i = 1; i < s.length(); i++) {
            String left = s.substring(0, i);
            String right = s.substring(i);
            max = Math.max(max, score(left, "0") + score(right, "1"));
        }

        return max;
    }

    private int score(String numbers, String target) {
        return (int) Arrays.stream(numbers.split(""))
                .filter(v -> v.equals(target))
                .count();
    }

    @DisplayName("test")
    @Test
    void test() {
        assertThat(maxScore("01001")).isEqualTo(4);
    }
}
