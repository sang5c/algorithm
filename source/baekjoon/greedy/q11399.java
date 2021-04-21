package baekjoon.greedy;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * https://www.acmicpc.net/problem/11399
 * Title: ATM
 * Date: 2021-04-21
 * Type: greedy
 */
public class q11399 {
    public static void main(String[] args) {
        int timeSum = 0;
        int timeWait = 0;

        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        // int count = 5;
        String times = scanner.nextLine();
        // String times = "3 1 4 3 2";
        List<Integer> timeSplit = Arrays.stream(times.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (timeSplit.size() > 0) {
            int min = 1000;
            for (Integer i : timeSplit) {
                if (i < min) {
                    min = i;
                }
            }
            timeWait += min;
            timeSum += timeWait;
            timeSplit.remove(Integer.valueOf(min));
        }
        System.out.println(timeSum);
    }
}
