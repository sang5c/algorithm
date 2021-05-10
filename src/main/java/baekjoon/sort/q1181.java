package baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * https://www.acmicpc.net/problem/q1181
 * Title: 단어 정렬
 * Date: 2021-05-10
 * Type: sort
 */
public class q1181 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        Set<String> words = new HashSet<>();

        for (int i = 0; i < N; i++) {
            words.add(reader.readLine());
        }

        String collect = words.stream()
                .sorted((o1, o2) -> o1.length() != o2.length() ? o1.length() - o2.length() : o1.compareTo(o2))
                .collect(Collectors.joining("\n"));
        System.out.println(collect);
    }

}
