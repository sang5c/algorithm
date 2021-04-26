package leetcode.easy;

/**
 * https://leetcode.com/problems/palindrome-number/
 * Date: 2020-09-05
 */
public class Q9_palindrome_number {
    public boolean isPalindrome(int x) {
        int temp = x;
        int newInteger = 0;
        if (x < 0) {
            return false;
        }
        while (temp > 0) {
            newInteger = (newInteger * 10) + temp % 10;
            temp = temp / 10;
        }
        return newInteger == x;
    }

    public static void main(String[] args) {
        Q9_palindrome_number solution = new Q9_palindrome_number();
        boolean result = solution.isPalindrome(121);
        System.out.println(result);
    }

}
