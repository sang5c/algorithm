package programmers.level1;

import java.util.Arrays;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42748
 * Title: K번째 수
 * Date: 2020-09-08
 */
public class q42748 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] tempArr = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(tempArr);
            answer[i] = tempArr[commands[i][2] - 1];
        }
        return answer;
    }

    public static void main(String[] args) {
        q42748 q = new q42748();
        int[] result = q.solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});
        System.out.println(Arrays.toString(result));
    }

}
