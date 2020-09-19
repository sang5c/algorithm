package programmers.level1;

import java.util.*;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12933
 * Title: 정수 내림차순으로 배치하기
 * Date: 2020-09-18
 */
public class q12933 {
    public long solution(long n) {
        List<Long> list = new ArrayList<>();

        while (n > 0) {
            list.add(n % 10);
            n /= 10;
        }

        list.sort(Comparator.reverseOrder());
        return list.stream()
                .reduce((a, b) -> a * 10 + b)
                .orElse(0L);
    }

    public static void main(String[] args) {
        q12933 q = new q12933();
        long result = q.solution(118372);
        System.out.println(result);
    }

}
