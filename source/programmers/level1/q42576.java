package programmers.level1;

import java.util.*;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42576?language=java
 * Date: 2020-09-07
 */
public class q42576 {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> users = new HashMap<>();
        for (String s : participant) {
            users.put(s, users.getOrDefault(s, 0) + 1);
        }

        for (String s : completion) {
            users.put(s, users.get(s) - 1);
        }

        for (Map.Entry<String, Integer> s : users.entrySet()) {
            if (s.getValue() == 1) {
                return s.getKey();
            }
        }
        throw new IllegalArgumentException("invalid parameter");
    }

    public static void main(String[] args) {
        q42576 q42576 = new q42576();
        String result = q42576.solution(new String[]{"leo", "kiki", "eden", "eden"}, new String[]{"eden", "kiki"});
        System.out.println(result);
    }

}
