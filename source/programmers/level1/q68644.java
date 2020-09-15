package programmers.level1;

import java.util.*;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/68644
 * Title: 두 개 뽑아서 더하기
 * Date: 2020-09-15
 */
public class q68644 {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        return set.stream().sorted().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        q68644 q = new q68644();
        int[] result = q.solution(new int[]{5,0,2,7});
        System.out.println(Arrays.toString(result));
    }

}
