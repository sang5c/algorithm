package baekjoon.sort;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * https://www.acmicpc.net/problem/2751
 * Title: 수 정렬하기 2
 * Date: 2021-05-05
 * Type: sort
 */
public class q2751 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());

        Integer[] arr = new Integer[count];
        for (int i = 0; i < count; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }

        Arrays.sort(arr);
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        for (Integer i : arr) {
            bufferedWriter.write(i + "\n");
        }

        reader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    // public static void sort(int[] arr, int start, int end) {
    //     if (start >= end)
    //         return;
    //
    //     int pivot = start;
    //     int left = start + 1;
    //     int right = end;
    //
    //     while (left <= right) {
    //         while (left <= end && arr[start] >= arr[left]) {
    //             left++;
    //         }
    //         while (right > start && arr[right] >= arr[pivot]) {
    //             right--;
    //         }
    //
    //         if (left > right) {
    //             swap(arr, start, right);
    //         } else {
    //             swap(arr, left, right);
    //         }
    //     }
    //
    //     sort(arr, start, right - 1);
    //     sort(arr, right + 1, end);
    //
    // }
    //
    // private static void swap(int[] arr, int i, int k) {
    //     int temp = arr[i];
    //     arr[i] = arr[k];
    //     arr[k] = temp;
    // }

    @Test
    public void test() {
        int[] arr = {5, 2, 3, 4, 1};
        Arrays.sort(arr);
        assertThat(arr).isEqualTo(new int[]{1, 2, 3, 4, 5});
    }

}
