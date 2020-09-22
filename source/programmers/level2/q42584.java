package programmers.level2;

import java.util.Arrays;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42584
 * Title: 주식가격
 * Date: 2020-09-22
 */
public class q42584 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            for (int k = i + 1; k < prices.length; k++) {
                answer[i] += 1;
                if (prices[i] > prices[k]) {
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        q42584 q = new q42584();
        int[] result = q.solution(new int[]{1, 2, 3, 2, 3});
        System.out.println(Arrays.toString(result));
    }

}
