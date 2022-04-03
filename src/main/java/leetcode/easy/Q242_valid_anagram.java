package leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * https://leetcode.com/problems/valid-anagram/
 * Date: 2022-04-03
 */
public class Q242_valid_anagram {
    public boolean isAnagram(String s, String t) {
        String[] s1 = s.split("");
        String[] s2 = t.split("");

        String str1 = Arrays.stream(s1)
                .sorted()
                .collect(Collectors.joining(""));

        String str2 = Arrays.stream(s2)
                .sorted()
                .collect(Collectors.joining(""));

        return str1.equals(str2);
    }

    @DisplayName("test")
    @Test
    void test() {
        assertThat(isAnagram("anagram", "nagaram")).isEqualTo(true);
    }
}

