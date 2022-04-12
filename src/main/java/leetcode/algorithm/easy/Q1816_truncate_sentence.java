package leetcode.algorithm.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * https://leetcode.com/problems/truncate-sentence/
 * Date: 2022-04-03
 */
public class Q1816_truncate_sentence {
    public String truncateSentence(String s, int k) {
        String[] split = s.split(" ");
        return Arrays.stream(split)
                .limit(k)
                .collect(Collectors.joining());
    }

    @DisplayName("test")
    @Test
    void test() {
        assertThat(truncateSentence("Hello how are you Contestant", 4)).isEqualTo("Hello how are you");
    }
}
