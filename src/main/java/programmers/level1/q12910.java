package programmers.level1;

import java.util.stream.LongStream;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12912
 * Title: 두 정수 사이의 합
 * Date: 2020-09-11
 */
public class q12910 {
    public long solution(int a, int b) {
        if (a == b) {
            return a;
        }

        if (b < a) {
            int temp = a;
            a = b;
            b = temp;
        }

        return LongStream.rangeClosed(a, b).sum();
    }

    public static void main(String[] args) {
        q12910 q = new q12910();
        long result = q.solution(5, 3);
        System.out.println(result);
    }

}
