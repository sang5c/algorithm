package etc.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Title: 병합 정렬
 * 특징: 분할 정복 알고리즘 (divide and conquer)
 * 작은 문제로 만들어 해결한 후 결과를 모은다. 재귀로 구현하는 경우가 많음
 * 자리 교대가 아닌 새로운 배열을 사용한다.
 * 설명: 가장 작은 단위까지 분할하여 정렬한다.
 * 1. 재귀를 빠져나갈 기준을 정하고(length < 2) 최소단위까지 쪼갠다.
 * 2. 더이상 쪼갤 수 없다면 정렬, 병합한다.
 * 시간복잡도: O(n log n)
 * 장점: 단순함, 교환 횟수 적음, 추가 메모리 사용하지 않음
 * left < right index 비교보다 length < 2 비교가 깔끔하다고 생각하여 아래 사이트 참고함
 * https://www.daleseo.com/sort-merge/
 */
public class MergeSort {

    public int[] sort(int[] arr) {
        if (arr.length < 2) {
            return arr;
        }

        int[] leftArr = sort(Arrays.copyOfRange(arr, 0, arr.length / 2));
        int[] rightArr = sort(Arrays.copyOfRange(arr, arr.length / 2, arr.length));
        int[] mergedArr = new int[arr.length];

        int m = 0;  // merged arr index
        int l = 0;  // left arr index
        int r = 0;  // right arr index

        // 두 배열의 원소를 병합하며 정렬한다.
        while (l < leftArr.length && r < rightArr.length) {
            mergedArr[m++] = leftArr[l] < rightArr[r] ? leftArr[l++] : rightArr[r++];
        }

        while (l < leftArr.length) {
            mergedArr[m++] = leftArr[l++];
        }
        while (r < rightArr.length) {
            mergedArr[m++] = rightArr[r++];
        }

        return mergedArr;
    }

    @Test
    public void test() {
        assertThat(sort(new int[]{5, 2, 3, 1, 4})).isEqualTo(new int[]{1, 2, 3, 4, 5});
        assertThat(sort(new int[]{5, 4, 3, 2, 1})).isEqualTo(new int[]{1, 2, 3, 4, 5});
    }

}
