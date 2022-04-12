package leetcode.algorithm.easy;

import java.util.*;

/**
 * https://leetcode.com/problems/valid-parentheses/
 * Date: 2020-09-05
 */
public class Q20_valid_parentheses {
    public boolean isValid(String s) {
        // 다른 괄호를 포함할 수 있으나 닫히는 순서가 열린 순서와 같아야 한다.
        // stack 푸시, 팝으로 구현하면 될거라고 생각했음.
        Stack<String> stack = new Stack<>();

        Map<String, String> brackets = new HashMap<>();
        brackets.put(")", "(");
        brackets.put("]", "[");
        brackets.put("}", "{");

        Collection<String> leftBrackets = brackets.values();
        String[] split = s.split("");
        for (String value : split) {
            if (leftBrackets.contains(value)) {
                stack.push(value);
                continue;
            }
            if (stack.empty() || !brackets.get(value).equals(stack.pop())) {
                return false;
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        Q20_valid_parentheses solution = new Q20_valid_parentheses();
        boolean result = solution.isValid("([]))");
        System.out.println(result);
    }

}
