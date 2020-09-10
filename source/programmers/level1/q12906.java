package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12906
 * Title: 같은 숫자는 싫어
 * Date: 2020-09-10
 */
public class q12906 {
    public int[] solution(int[] arr) {
        int beforeNumber = -1;

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int number : arr) {
            if (beforeNumber != number) {
                arrayList.add(number);
            }
            beforeNumber = number;
        }

        return arrayList.stream()
                .mapToInt(i -> i)
                .toArray();
    }

    public static void main(String[] args) {
        q12906 q = new q12906();
        int[] result = q.solution(new int[]{1, 1, 3, 3, 0, 1, 1});
        System.out.println(Arrays.toString(result));
    }

}
