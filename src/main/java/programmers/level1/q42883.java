package programmers.level1;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42883?language=java
 * Title: 큰 수 만들기
 * Date: 2021-04-24
 * Type: greedy
 */
public class q42883 {
    class Pair {
        int value;
        int index;

        Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }

    }

    public int solution(int[] numbers, int target) {
        int answer = 0;
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(numbers[0], 0));
        queue.offer(new Pair(-numbers[0], 0));
        while (!queue.isEmpty()) {
            Pair pair = queue.poll();
            if (pair.index == numbers.length - 1) {
                if (pair.value == target) {
                    answer += 1;
                }
                continue;
            }
            int c1 = pair.value + numbers[pair.index + 1];
            int c2 = pair.value - numbers[pair.index + 1];
            queue.add(new Pair(c1, pair.index + 1));
            queue.add(new Pair(c2, pair.index + 1));
        }
        return answer;
    }

    @Test
    public void test() {
        // assertThat(solution("1924", 2)).isEqualTo("94");
        // assertThat(solution("1231234", 3)).isEqualTo("3234");
        assertThat(solution(new int[]{1, 1, 1, 1, 1}, 3)).isEqualTo(5);
    }

}
