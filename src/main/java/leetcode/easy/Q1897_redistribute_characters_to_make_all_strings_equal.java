package leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * https://leetcode.com/problems/redistribute-characters-to-make-all-strings-equal/
 * Date: 2022-04-10
 */
public class Q1897_redistribute_characters_to_make_all_strings_equal {
    public boolean makeEqual(String[] words) {
        if (words.length <= 1) {
            return true;
        }

        Map<String, Integer> countMap = new HashMap<>();

        Arrays.stream(words)
                .flatMap(s -> Arrays.stream(s.split("")))
                .forEach(c -> countMap.put(c, countMap.getOrDefault(c, 0) + 1));

        return countMap.values().stream()
                .allMatch(v -> v % words.length == 0);
    }

    @DisplayName("test")
    @Test
    void test() {
        assertThat(makeEqual(new String[]{"caaaaa","aaaaaaaaa","a","bbb","bbbbbbbbb","bbb","cc","cccccccccccc","ccccccc","ccccccc","cc","cccc","c","cccccccc","c"})).isEqualTo(true);
    }
}
