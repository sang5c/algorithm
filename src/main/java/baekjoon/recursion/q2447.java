package baekjoon.recursion;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/2447
 * Title: 별 찍기 - 10
 * Date: 2021-04-26
 * Type: recursion
 */
public class q2447 {

    public static final char STAR = '*';
    public static final char BLANK = ' ';

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // int input = scanner.nextInt();
        int input = 3;
        int[][] arr = new int[input][input];
        getStar(input, arr);
        printStar(arr);
    }

    private static void printStar(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr[0].length; k++) {
                if (arr[i][k] == 1) {
                    System.out.print(STAR);
                } else {
                    System.out.print(BLANK);
                }
            }
            System.out.println();
        }
    }

    private static void getStar(int input, int[][] arr) {
        if (input != 3)
        for (int i = 0; i < input; i++) {
            for (int k = 0; k < input; k++) {
                if (i == 1 && k == 1) {
                    continue;
                }
                arr[i][k] = 1;
            }
        }
    }

}
