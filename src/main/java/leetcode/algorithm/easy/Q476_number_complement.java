package leetcode.algorithm.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * https://leetcode.com/problems/number-complement/
 * Date: 2022-04-07
 */
public class Q476_number_complement {
    public int findComplement(int num) {
        return Integer.parseInt(changeToBinaryComplement(num), 2);
    }

    private String changeToBinaryComplement(int num) {
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            sb.append(getComplement(num % 2));
            num /= 2;
        }
        return sb.reverse().toString();
    }

    private int getComplement(int num) {
        return num == 0 ? 1 : 0;
    }

    @DisplayName("test")
    @Test
    void test() {
        assertThat(findComplement(5)).isEqualTo(2);
    }
}

