package programmers.level1;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/1845
 * Title: 폰켓몬
 * Date: 2021-04-23
 */
public class q1845 {
    public int solution(int[] nums) {
        Set<Integer> collect = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toSet());
        System.out.println(collect);
        return Math.min(collect.size(), nums.length / 2);
    }

    @Test
    public void test() {
        assertThat(solution(new int[]{3, 1, 2, 3})).isEqualTo(2);
        assertThat(solution(new int[]{3, 3, 3, 2, 2, 4})).isEqualTo(3);
        assertThat(solution(new int[]{3, 3, 3, 2, 2, 2})).isEqualTo(2);
    }

}

