package leetcode.algorithm.easy;

/**
 * https://leetcode.com/problems/reverse-integer/
 * Date: 2020-09-04
 */
public class Q7_reverse_integer {

    // TODO: 문자열로 변환하지 않고 풀기
    public int reverse(int x) {
        int temp = x > 0 ? x : -x;

        StringBuilder reverseBuilder = new StringBuilder("0");

        while (temp > 0) {
            reverseBuilder.append(temp % 10);
            temp = temp / 10;
        }
        try {
            int result = Integer.parseInt(reverseBuilder.toString());
            return x > 0 ? result : -result;
        } catch (NumberFormatException e) {
            return 0;
        }

    }

    public static void main(String[] args) {
        Q7_reverse_integer solution7 = new Q7_reverse_integer();
        int result = solution7.reverse(1534236469);
        System.out.println(result);
    }

}
