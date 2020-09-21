package programmers.level1;

import java.util.Arrays;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12954
 * Title: x만큼 간격이 있는 n개의 숫자
 * Date: 2020-09-21
 */
public class q12954 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 0; i < n; i++) {
            answer[i] = (long) x * (i + 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        q12954 q = new q12954();
        long[] result = q.solution(4, 3);
        System.out.println(Arrays.toString(result));
    }

}
