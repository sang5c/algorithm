package programmers.level1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12932
 * Title: 자연수 뒤집어 배열로 만들기
 * Date: 2020-09-17
 */
public class q12932 {
    public int[] solution(long n) {
        List<Integer> linkedList = new LinkedList<>();

        while (n > 0) {
            linkedList.add((int) (n % 10));
            n /= 10;
        }
        return linkedList.stream()
                .mapToInt(i -> i)
                .toArray();
    }

    public static void main(String[] args) {
        q12932 q = new q12932();
        int[] result = q.solution(12345);
        System.out.println(Arrays.toString(result));
    }

}
