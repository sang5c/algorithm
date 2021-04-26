package programmers.level1;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12926
 * Title: 시저 암호
 * Date: 2020-09-15
 */
public class q12926 {
    public String solution(String s, int n) {
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (Character.isLowerCase(chars[i])) {
                chars[i] = (char) ((chars[i] + n - 'a') % 26 + 'a');
            } else if (Character.isUpperCase(chars[i])) {
                chars[i] = (char) ((chars[i] + n - 'A') % 26 + 'A');
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        q12926 q = new q12926();
        String result = q.solution("A B z", 4);
        System.out.println(result);
    }

}
