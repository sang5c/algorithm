package programmers.level1;

import java.util.regex.Pattern;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12918
 * Title: 문자열 다루기 기본
 * Date: 2020-09-14
 */
public class q12918 {
    private static final Pattern p = Pattern.compile("^\\d{4}|\\d{6}$");

    public boolean solution(String s) {
        return p.matcher(s).matches();
    }

    public static void main(String[] args) {
        q12918 q = new q12918();
        boolean result = q.solution("123a");
        System.out.println(result);
    }

}
