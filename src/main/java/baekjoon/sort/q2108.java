package baekjoon.sort;

import java.io.*;

/**
 * https://www.acmicpc.net/problem/2108
 * Title: 통계학
 * Date: 2021-05-08
 * Type: sort
 */
public class q2108 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());    // N은 홀수

        int[] countArr = new int[8001];
        int[] arr = new int[N];
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            int input = Integer.parseInt(reader.readLine());
            countArr[input + 4000]++;
            arr[i] = input;

            sum += input;
            if (max < input) {
                max = input;
            }
            if (min > input) {
                min = input;
            }
        }

        int maxIndex = 99999;
        int maxValue = 0;
        boolean find = false;

        for (int i = 0; i < countArr.length; i++) {
            if (countArr[i] > maxValue) {
                maxIndex = i - 4000;
                maxValue = countArr[i];
                find = true;
            } else if (find && countArr[i] == maxValue) {
                maxIndex = i - 4000;
                find = false;
            }

            if (i != 0) {
                countArr[i] += countArr[i - 1];
            }
        }

        Integer[] sorted = new Integer[N];

        for (int i = sorted.length - 1; i >= 0; i--) {
            sorted[--countArr[arr[i] + 4000]] = arr[i];
        }

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        bufferedWriter.write(Math.round(sum / (double) N) + "\n");
        bufferedWriter.write(sorted[sorted.length / 2] + "\n");
        bufferedWriter.write(maxIndex + "\n");
        bufferedWriter.write(max - min + "\n");

        reader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }

}
