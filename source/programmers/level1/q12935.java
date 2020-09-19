package programmers.level1;

import java.util.Arrays;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12935
 * Title: 제일 작은 수 제거하기
 * Date: 2020-09-19
 */
public class q12935 {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }

        int minValue = Arrays.stream(arr)
                .min()
                .orElseThrow(IllegalArgumentException::new);

        return Arrays.stream(arr)
                .filter(i -> i != minValue)
                .toArray();
    }

    public static void main(String[] args) {
        q12935 q = new q12935();
        int[] result = q.solution(new int[]{10});
        System.out.println(Arrays.toString(result));
    }

}
