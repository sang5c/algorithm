package programmers.level1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12917
 * Title: 문자열 내림차순으로 배치하기
 * Date: 2020-09-14
 */
public class q12917 {
    public String solution(String s) {
        return Arrays.stream(s.split(""))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        q12917 q = new q12917();
        String result = q.solution("Zbcdefg");
        System.out.println(result);
    }

}
