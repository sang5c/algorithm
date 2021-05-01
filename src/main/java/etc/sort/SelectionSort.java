package etc.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Title: 선택 정렬
 * 특징: 제자리 정렬 알고리즘
 * 설명: 자리를 선택하고 최소값과 교환한다.
 * 1. 자리를 선택하고 (가장 처음 또는 끝부터 시작)
 * 2. 최소값을 찾은 후
 * 3. 선택했던 자리에 있던 원소와 비교 후 스왑
 * 시간복잡도: O(n^2)
 * 장점: 단순함, 교환 횟수 적음, 추가 메모리 사용하지 않음
 */
public class SelectionSort {

    public int[] sort(int[] arr) {                          // 매개변수로 받은 arr을 직접 수정하면 호출한 쪽에서 전달한 배열 내 값도 같이 수정된다. (얕은 복사)
        int[] newArr = Arrays.copyOf(arr, arr.length);      // 깊은 복사

        for (int i = 0; i < newArr.length - 1; i++) {
            int minIndex = i;
            for (int k = i + 1; k < newArr.length; k++) {
                if (newArr[minIndex] > newArr[k]) {
                    minIndex = k;
                }
            }
            if (minIndex != i)
                swap(newArr, minIndex, i);
        }
        return newArr;
    }

    private void swap(int[] arr, int i, int k) {
        int temp = arr[i];
        arr[i] = arr[k];
        arr[k] = temp;
    }

    @Test
    public void test() {
        assertThat(sort(new int[]{5, 2, 3, 1, 4})).isEqualTo(new int[]{1, 2, 3, 4, 5});
        assertThat(sort(new int[]{5, 4, 3, 2, 1})).isEqualTo(new int[]{1, 2, 3, 4, 5});
    }

}
