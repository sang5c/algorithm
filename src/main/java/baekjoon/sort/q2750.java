package baekjoon.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * https://www.acmicpc.net/problem/2750
 * Title: 수 정렬하기
 * Date: 2021-05-01
 * Type: sort
 */
public class q2750 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] result = sort(arr);
        for (int i : result) {
            System.out.println(i);
        }
    }

    public static int[] sort(int[] arr) {                          // 매개변수로 받은 arr을 직접 수정하면 호출한 쪽에서 전달한 배열 내 값도 같이 수정된다. (얕은 복사)
        int[] newArr = Arrays.copyOf(arr, arr.length);      // 깊은 복사
        for (int i = 1; i < newArr.length; i++) {
            for (int k = i; k > 0; k--) {
                if (newArr[k] < newArr[k - 1]) {
                    swap(newArr, k, k - 1);
                }
            }
        }
        return newArr;
    }

    private static void swap(int[] arr, int i, int k) {
        int temp = arr[i];
        arr[i] = arr[k];
        arr[k] = temp;
    }

    @Test
    public void test() {
        assertThat(sort(new int[]{5, 2, 3, 4, 1})).isEqualTo(new int[]{1, 2, 3, 4, 5});
    }

}
