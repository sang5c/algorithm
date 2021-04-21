package baekjoon.greedy;

import java.util.*;
import java.util.stream.Collectors;

/**
 * https://www.acmicpc.net/problem/11047
 * Title: 동전 0
 * Date: 2021-04-21
 * Type: greedy
 */
public class q11047 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        // String input1 = "10 4200";

        String[] split1 = input1.split(" ");
        int count = Integer.parseInt(split1[0]);
        int target = Integer.parseInt(split1[1]);

        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        // String input2 = "1\n5\n10\n50\n100\n500\n1000\n5000\n10000\n50000";

        // List<Integer> coins = Arrays.stream(input2.split("\n"))
        List<Integer> coins = Arrays.stream(arr)
                // .map(Integer::parseInt)
                .filter(c -> target >= c)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        int sum = 0;
        int coinCount = 0;

        for (Integer coin : coins) {
            while(sum + coin <= target) {
                sum += coin;
                coinCount++;
            }
        }

        scanner.close();
        System.out.println(coinCount);
    }

}
