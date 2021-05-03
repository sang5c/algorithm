package etc.sort;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Title: 퀵 정렬
 * 특징: 분할 정복 알고리즘 (divide and conquer)
 * 작은 문제로 만들어 해결한 후 결과를 모은다. 재귀로 구현하는 경우가 많음
 * 내장된 정렬 알고리즘의 경우 퀵정렬을 사용하는 경우가 많다.
 * 설명: 기준을 정하고 기준보다 큰 수는 우측으로, 작은 수는 좌측으로 정렬 후 기준좌우로 배열을 분할하여 반복 진행한다.
 * 기준(피벗)을 정하는 방법: 첫번째 인덱스 또는 중간 인덱스
 * 1. 재귀를 빠져나갈 기준을 정한다. (left > right)
 * 2. 피벗을 정하고 배열의 우측에서부터 피벗보다 작은 값을, 좌측에서부터 피벗부터 큰 값을 선택하여 서로 스왑한다.
 * 3. 좌, 우 포인터가 교차하는 경우 오른쪽 포인터와 피벗을 교체한다.
 * 4. 피벗의 좌측과, 피벗의 우측으로 나눠 다시 과정을 진행한다.
 * 시간복잡도: O(n log n) / 최악 O(N^2)
 * 장점: 빠르다.
 */
public class QuickSort {

    public void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private void quickSort(int[] arr, int start, int end) {
        if (start >= end)
            return;

        int left = start + 1;
        int right = end;

        while (left <= right) {
            while (left <= end && arr[start] >= arr[left]) {
                left++;
            }
            while (right > start && arr[start] <= arr[right]) {
                right--;
            }

            // 교차면 피벗과 right 교환
            if (left > right) {
                swap(arr, start, right);
            } else { // 아니면 작은값, 큰값 서로 교환
                swap(arr, left, right);
            }
        }

        quickSort(arr, start, right - 1);
        quickSort(arr, right + 1, end);
    }

    private void swap(int[] arr, int pivot, int right) {
        int temp = arr[pivot];
        arr[pivot] = arr[right];
        arr[right] = temp;
    }

    @Test
    public void test() {
        int[] arr = {5, 4, 2, 3, 1};
        assertThat(arr).isNotEqualTo(new int[]{1, 2, 3, 4, 5});
        sort(arr);
        assertThat(arr).isEqualTo(new int[]{1, 2, 3, 4, 5});
    }

}
