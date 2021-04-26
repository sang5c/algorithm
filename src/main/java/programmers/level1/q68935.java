package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/68935
 * Title: 3진법 뒤집기
 * Date: 2021-04-23
 */
public class q68935 {
    public int solution(int n) {
        return Integer.parseInt(convertBase(n, 3), 3);
    }

    private String convertBase(int number, int base) {
        StringBuilder builder = new StringBuilder();

        while (number > 0) {
            builder.append(number % base);
            number = number / base;

        }
        return builder.toString();
    }

    public static void main(String[] args) {
        q68935 q = new q68935();
        int result = q.solution(45);
        System.out.println(result);
    }

    @Test
    public void test() {
        assertThat(solution(45)).isEqualTo(7);
        assertThat(solution(125)).isEqualTo(229);
    }

}

