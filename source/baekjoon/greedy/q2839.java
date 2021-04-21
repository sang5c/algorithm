package baekjoon.greedy;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/2839
 * Title: 설탕 배달
 * Date: 2021-04-21
 * Type: greedy
 */
public class q2839 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int targetKg = scanner.nextInt();
        // int targetKg = 100;

        int result = -1;

        for (int countOf5 = targetKg / 5; countOf5 >= 0; countOf5--) {
            int remainder = targetKg - (countOf5 * 5);

            if (remainder % 3 != 0) {
                continue;
            }

            int countOf3 = remainder / 3;
            result = countOf3 + countOf5;
            break;
        }

        System.out.println(result);
    }

}
