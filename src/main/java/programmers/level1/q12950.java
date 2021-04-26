package programmers.level1;

import java.util.Arrays;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12950
 * Title: 행렬의 덧셈
 * Date: 2020-09-21
 */
public class q12950 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] result = new int[arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int k = 0; k < arr1[0].length; k++) {
                result[i][k] = arr1[i][k] + arr2[i][k];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        q12950 q = new q12950();
        int[][] result = q.solution(new int[][]{{1, 2}, {2, 3}}, new int[][]{{3, 4}, {5, 6}});
        System.out.println(Arrays.deepToString(result));
    }

}
