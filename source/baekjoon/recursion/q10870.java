package baekjoon.recursion;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * https://www.acmicpc.net/problem/10870
 * Title: 피보나치 수 5
 * Date: 2021-04-26
 * Type: recursion
 */
public class q10870 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        long result = fibonacci(input);

        System.out.println(result);
    }

    private static long fibonacci(long input) {
        if (input <= 1) {
            return input;
        }

        return fibonacci(input - 1) + fibonacci(input - 2);
    }

    @Test
    public void test() {
        assertThat(fibonacci(10)).isEqualTo(55);
    }

}
