package baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * https://www.acmicpc.net/problem/q18870
 * Title: 좌표 압축
 * Date: 2021-05-10
 * Type: sort
 */
public class q18870 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        List<Integer> list = new ArrayList<>(N);
        List<Integer> sortList = new ArrayList<>(N);

        String[] s = reader.readLine().split(" ");
        for (String value : s) {
            int input = Integer.parseInt(value);
            list.add(input);
            sortList.add(input);
        }

        Collections.sort(sortList);
        int index = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer integer : sortList) {
            if (!map.containsKey(integer)) {
                map.put(integer, index++);
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (Integer value : list) {
            stringBuilder.append(map.get(value)).append(" ");
        }
        System.out.println(stringBuilder);

    }

}
