package programmers.level1;

import java.util.Arrays;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12944
 * Title: 평균 구하기
 * Date: 2020-09-21
 */
public class q12944 {
    public double solution(int[] arr) {
        return Arrays.stream(arr)
                .average()
                .orElse(0.0);
    }

    public double solution2(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum == 0 ? 0.0 : sum / (double) arr.length;
    }

    public static void main(String[] args) {
        q12944 q = new q12944();
        double result = q.solution(new int[]{0});
        System.out.println(result);
    }

}
