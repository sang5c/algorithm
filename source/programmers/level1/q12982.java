package programmers.level1;

import java.util.Arrays;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12982
 * Title: 예산
 * Date: 2020-09-22
 */
public class q12982 {
    public int solution(int[] d, int budget) {
        int cnt = 0;
        Arrays.sort(d);
        for (int j : d) {
            budget -= j;
            if (budget < 0) {
                break;
            }
            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        q12982 q = new q12982();
        int result = q.solution(new int[]{1, 3, 2, 5, 4}, 9);
        System.out.println(result);
    }

}
