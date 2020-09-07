package leetcode.easy;

/**
 * https://leetcode.com/problems/length-of-last-word/
 * Date: 2020-09-07
 */
public class Q58_length_of_last_world {
    public int lengthOfLastWord(String s) {
        String[] s1 = s.split(" ");
        if (s1.length == 0)
            return 0;
        return s1[s1.length - 1].length();
    }

    public static void main(String[] args) {
        Q58_length_of_last_world solution = new Q58_length_of_last_world();
        int result = solution.lengthOfLastWord(" ");
        System.out.println(result);
    }

}
