package baekjoon.bruteforce;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * https://www.acmicpc.net/problem/7568
 * Title: 덩치
 * Date: 2021-04-27
 * Type: brute force
 */
public class q7568 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] sizes = new int[N][2];
        for (int i = 0; i < N; i++) {
            sizes[i][0] = scanner.nextInt();
            sizes[i][1] = scanner.nextInt();
        }
        int[] result = bodySize(sizes);

        for (int j : result) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    private static int[] bodySize(int[][] sizes) {
        int[] result = new int[sizes.length];
        Arrays.fill(result, 1);

        for (int i = 0; i < sizes.length; i++) {
            for (int k = i + 1; k < sizes.length; k++) {
                if (sizes[i][0] > sizes[k][0] && sizes[i][1] > sizes[k][1]) {
                    result[k]++;
                } else if (sizes[i][0] < sizes[k][0] && sizes[i][1] < sizes[k][1]) {
                    result[i]++;
                }
            }
        }
        return result;
    }

    @Test
    public void test() {
        assertThat(bodySize(new int[][]{{55, 185}, {58, 183}, {88, 186}, {60, 175}, {46, 155}})).isEqualTo(new int[]{2, 2, 1, 2, 5});
    }


}
