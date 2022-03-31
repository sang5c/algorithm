package leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * https://leetcode.com/problems/maximum-number-of-words-you-can-type/
 * Date: 2022-03-31
 */
public class Q1935_maximum_number_of_words_you_can_type {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] strs = text.split(" ");
        return (int) Arrays.stream(strs)
                .filter(str -> notContains(str, brokenLetters))
                .count();
    }

    private boolean notContains(String str, String brokenLetters) {
        if (brokenLetters.length() == 0) {
            return true;
        }
        String[] letters = brokenLetters.split("");
        for (String letter : letters) {
            if (str.contains(letter)) {
                return false;
            }
        }
        return true;
    }

    @DisplayName("test")
    @Test
    void test() {
        assertThat(canBeTypedWords("abc de", "")).isEqualTo(2);
    }
}
