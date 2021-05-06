package etc.sort;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Title: 카운팅 정렬
 * 시간복잡도: O(n)
 */
public class CountingSort {

    public int[] sort(int[] arr) {
        int max = 5;
        int[] count = new int[max + 1]; // 원소가 0부터 시작하는 경우 +1 해야함.
        int[] sorted = new int[arr.length];

        // 카운팅
        for (int i : arr) {
            count[i]++;
        }

        // 누적합
        for (int i = 0; i < count.length - 1; i++) {
            count[i + 1] += count[i];
        }

        // 정렬
        for (int i = arr.length - 1; i >= 0; i--) {
            sorted[--count[arr[i]]] = arr[i];
        }

        return sorted;

    }

    public int[] enhancedSort(int[] arr) {
        int max = 5;
        int[] count = new int[max + 1]; // 원소가 0부터 시작하는 경우 +1 해야함.
        int[] sorted = new int[arr.length];

        // 카운팅
        for (int i : arr) {
            count[i]++;
        }

        // 누적합
        for (int i = 0; i < count.length - 1; i++) {
            count[i + 1] += count[i];
        }

        // 정렬
        for (int i = arr.length - 1; i >= 0; i--) {
            sorted[--count[arr[i]]] = arr[i];
        }

        return sorted;

    }

    @Test
    public void test() {
        assertThat(sort(new int[]{0, 5, 1, 2, 1, 5})).isEqualTo(new int[]{0, 1, 1, 2, 5, 5});
        assertThat(sort(new int[]{5, 4, 3, 2, 1})).isEqualTo(new int[]{1, 2, 3, 4, 5});
    }

}
