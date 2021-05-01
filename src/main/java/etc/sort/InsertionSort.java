package etc.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Title: 삽입 정렬
 * 설명: 손 안의 카드를 정렬하는 방법
 *      선택한 원소보다 앞의 원소가 큰지 비교하고, 큰 경우 뒤로 한칸씩 밀면서 꽂아넣는(삽입) 정렬 방법.
 *      구현시 min 값을 찾는 방법과, 직전 값과 비교하고 즉시 스왑하는 방법이 있다. 코드는 두번째 방법으로 구현했음.
 *      앞의 원소와 비교하기 때문에 2번째 원소부터 선택하여 비교를 시작한다.
 * 시간복잡도: O(n^2)
 * 단점: 정렬이 발생할 때마다 데이터를 각각 한 칸씩 밀어야 되기 때문에 배열의 크기가 커질수록 효율 저하
 */
public class InsertionSort {

    public int[] sort(int[] arr) {                          // 매개변수로 받은 arr을 직접 수정하면 호출한 쪽에서 전달한 배열 내 값도 같이 수정된다. (얕은 복사)
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
