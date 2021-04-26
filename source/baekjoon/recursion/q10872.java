package baekjoon.recursion;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * https://www.acmicpc.net/problem/10872
 * Title: 팩토리얼
 * Date: 2021-04-26
 * Type: recursion
 */
public class q10872 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        long result = factorial(input);

        System.out.println(result);
    }

    private static long factorial(long input) {
        if (input <= 1) {
            return 1;
        }

        return input * factorial(input - 1);
    }

    @Test
    public void test() {
        assertThat(factorial(10)).isEqualTo(3628800);
        assertThat(factorial(0)).isEqualTo(1);
    }

}
