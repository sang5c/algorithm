package baekjoon.bruteforce;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * https://www.acmicpc.net/problem/2231
 * Title: 분해합
 * Date: 2021-04-27
 * Type: brute force
 */
public class q2231 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int result = decompose(N);
        System.out.println(result);
    }

    private static int decompose(int target) {
        for (int i = 0; i < target; i++) {
            int sum = i;
            int temp = i;
            while (temp % 10 != 0) {
                sum += temp % 10;
                temp /= 10;
            }

            if (sum == target) {
                return i;
            }
        }
        return 0;
    }

    @Test
    public void test() {
        assertThat(decompose(216)).isEqualTo(198);
        assertThat(decompose(256)).isEqualTo(245);
    }

}
