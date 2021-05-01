package etc.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Title: 버블 정렬
 * 특징: 제자리 정렬 알고리즘
 * 설명: 인접한 두 원소를 비교하여 기준에 따라 스왑한다.
 * 1. 0번째 원소와 1번째 원소를 비교하여 0번째 원소가 더 큰 경우 스왑
 * 2. 1, 2번째... 2, 3번째 .... 계속 인접 원소를 비교하여 마지막까지 진행
 * 3. 완료하면 length - 1 까지 진행 (이미 가장 큰게 갔기 때문)
 * 시간복잡도: O(n^2)
 * 장점: 단순함
 * 단점: 원소가 많으면 비교가 많아진다. 최선/최악 모두 n^2
 */
public class BubbleSort {

    public int[] sort(int[] arr) {                          // 매개변수로 받은 arr을 직접 수정하면 호출한 쪽에서 전달한 배열 내 값도 같이 수정된다. (얕은 복사)
        int[] newArr = Arrays.copyOf(arr, arr.length);      // 깊은 복사

        for (int i = newArr.length - 1; i >= 0; i--) {
            for (int k = 0; k < i; k++) {
                if (newArr[k] > newArr[k + 1]) {
                    swap(newArr, k, k + 1);
                }
            }
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
