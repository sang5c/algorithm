package etc.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Title: 셸 정렬
 * 특징: 사람 이름을 따서 붙여짐.
 * 설명: 특정 간격을 두고 부분 집합으로 쪼개 삽입 정렬을 실시한다.
 * 삽입정렬의 성능을 향상시키기 위한 목적
 * 1. 원소와 배열의 길이/2만큼의 간격을 두고있는 원소를 선택하여 비교, 정렬
 * 2. 기존 간격의 2분의 1로 설정 후 다시 n의 배수만큼 간격을 갖는 것들 끼리 정렬한다.
 * 시간복잡도: 최선 O(n log n) / 최악 O(N^2)
 */
public class ShellSort {

    public void sort(int[] arr) {
        int gap = arr.length / 2;   // 편의상 나누기2를 하였으나 나누기3 + 1의 갭이 더 빠르다고 함.
        while (gap >= 1) {
            for (int i = 0; i < gap; i++) { // gap의 간격이기 때문에 gap까지만 하면 부분집합을 모두 반복하게 된다.
                insertionSort(arr, i, gap);
            }
            System.out.println(Arrays.toString(arr));

            gap /= 2;
        }
    }

    private void insertionSort(int[] arr, int start, int gap) {
        for (int i = start + gap; i < arr.length; i += gap) {  // 삽입정렬에서 첫 값은 정렬하지 않아도 된다.
            for (int k = i; k > start; k -= gap) {
                if (arr[k] < arr[k - gap]) {
                    swap(arr, k, k - gap);
                }
            }
        }
    }

    private void swap(int[] arr, int pivot, int right) {
        int temp = arr[pivot];
        arr[pivot] = arr[right];
        arr[right] = temp;
    }

    @Test
    public void test() {
        int[] arr = {8, 5, 7, 1, 6, 2, 4, 3};
        assertThat(arr).isNotEqualTo(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        sort(arr);
        assertThat(arr).isEqualTo(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
    }

}
