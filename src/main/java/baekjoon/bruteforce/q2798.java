package baekjoon.bruteforce;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * https://www.acmicpc.net/problem/2447
 * Title: 블랙잭
 * Date: 2021-04-27
 * Type: brute force
 */
public class q2798 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] deck = new int[N];
        for (int i = 0; i < N; i++) {
            deck[i] = scanner.nextInt();
        }

        int result = blackjack(deck, M);
        System.out.println(result);
    }

    private static int blackjack(int[] deck, int target) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < deck.length; i++) {
            for (int k = i+1; k < deck.length; k++) {
                for (int m = k+1; m < deck.length; m++) {
                    int sum = deck[i] + deck[k] + deck[m];
                    if (target >= sum) {
                        list.add(sum);
                    }
                }
            }
        }
        return list.stream()
                .max(Comparator.naturalOrder())
                .get();
    }

    @Test
    public void test() {
        assertThat(blackjack(new int[]{5, 6, 7, 8, 9}, 21)).isEqualTo(21);
        assertThat(blackjack(new int[]{93, 181, 245, 214, 315, 36, 185, 138, 216, 295}, 500)).isEqualTo(497);
    }

}
