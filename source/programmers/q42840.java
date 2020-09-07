package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42840
 * Date: 2020-09-07
 */
public class q42840 {
    private static final int[] pattern1 = new int[]{1, 2, 3, 4, 5};
    private static final int[] pattern2 = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
    private static final int[] pattern3 = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

    public int[] solution(int[] answers) {
        int[] arr = new int[3];
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == pattern1[i % pattern1.length]) {
                arr[0] += 1;
            }
            if (answers[i] == pattern2[i % pattern2.length]) {
                arr[1] += 1;
            }
            if (answers[i] == pattern3[i % pattern3.length]) {
                arr[2] += 1;
            }
        }

        int max = 0;
        List<Integer> list = new ArrayList<>();
        for (int j : arr) {
            if (j >= max) {
                max = j;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                list.add(i + 1);
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        q42840 q = new q42840();
        int[] result = q.solution(new int[]{1, 2, 3, 4, 5});
        System.out.println(Arrays.toString(result));
    }

}
