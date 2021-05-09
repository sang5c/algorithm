package baekjoon.sort;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * https://www.acmicpc.net/problem/1427
 * Title: 소트인사이드
 * Date: 2021-05-09
 * Type: sort
 */
public class q1427 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String N = reader.readLine();

        String result = sort(N);
        System.out.println(result);
    }

    private static String sort(String number) {
        String[] split = number.split("");
        return Arrays.stream(split)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining());
    }

    @Test
    public void test() {
        assertThat(sort("4231")).isEqualTo("4321");
    }

}
