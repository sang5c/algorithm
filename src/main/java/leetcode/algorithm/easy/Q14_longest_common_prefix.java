package leetcode.algorithm.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * https://leetcode.com/problems/longest-common-prefix/
 * Date: 2022-03-28
 */
public class Q14_longest_common_prefix {
    public String longestCommonPrefix(String[] strs) {
        List<String> strings = Arrays.stream(strs)
                .sorted(Comparator.comparingInt(String::length))
                .toList();

        String targetStr = strings.get(0);

        String prefix = "";
        for (int length = 0; length < targetStr.length(); length++) {
            String finalSubstring = targetStr.substring(0, length+1);;
            boolean match = strings.stream()
                    .allMatch(s -> s.startsWith(finalSubstring));

            if (!match) {
                break;
            }
            prefix = finalSubstring;
        }
        return prefix;
    }

    public static void main(String[] args) {
        Q14_longest_common_prefix solution = new Q14_longest_common_prefix();
        String result = solution.longestCommonPrefix(new String[]{"flower", "flow", "flight"});
        // String result = solution.longestCommonPrefix(new String[]{"a"});
        System.out.println(result);
    }

}
