package baekjoon.greedy;

import java.util.*;
import java.util.stream.Collectors;

/**
 * https://www.acmicpc.net/problem/1931
 * Title: 회의실 배정
 * Date: 2021-04-22
 * Type: greedy
 */
public class q1931 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        List<int[]> times = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            int[] time = new int[2];
            time[0] = scanner.nextInt();
            time[1] = scanner.nextInt();

            times.add(time);
        }

        // ARRYAS.SORT
        List<int[]> collect = times.stream()
                .sorted((o1, o2) -> o1[1] == o2[1] ? o1[0] - o2[0] : o1[1] - o2[1])
                .collect(Collectors.toList());

        System.out.println("=====sort result=====");
        for (int[] ints : collect) {
            System.out.println(Arrays.toString(ints));
        }
        System.out.println("=============");

        int[] beforeTime = collect.get(0);
        int result = 1;
        for (int i = 1; i < collect.size(); i++) {
            int[] time = collect.get(i);
            if (beforeTime[1] > time[0]) {
                System.out.println("time: " + Arrays.toString(time));
                continue;
            }
            beforeTime = time;
            System.out.println("select: " + Arrays.toString(time));

            result++;
        }

        System.out.println(result);
    }

}
