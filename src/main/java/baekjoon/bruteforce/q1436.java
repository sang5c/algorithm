package baekjoon.bruteforce;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * https://www.acmicpc.net/problem/1436
 * Title: 영화감독 숌
 * Date: 2021-04-28
 * Type: brute force
 */
public class q1436 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        String series = generateSeries(N);
        System.out.println(series);
    }

    private static String generateSeries(int n) {
        int series = 1;
        int cnt = 0;
        while (true) {
            if (String.valueOf(series).contains("666")) {
                cnt++;
            }
            if (cnt == n)
                return String.valueOf(series);
            series++;
        }
    }

    @Test
    public void test() {
        assertThat(generateSeries(2)).isEqualTo("1666");
        assertThat(generateSeries(1)).isEqualTo("666");
        assertThat(generateSeries(7)).isEqualTo("6660");
        assertThat(generateSeries(8)).isEqualTo("6661");
    }

}
