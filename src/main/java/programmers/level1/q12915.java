package programmers.level1;

import java.util.Arrays;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12915
 * Title: 문자열 내 마음대로 정렬하기
 * Date: 2020-09-11
 */
public class q12915 {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (a, b) -> {
            if (a.charAt(n) == b.charAt(n)) {
                return a.compareTo(b);
            } else if (a.charAt(n) <= b.charAt(n)) {
                return -1;
            }
            return 1;
        });
        return strings;
    }

    //    public String[] solution(String[] strings, int n) {
    //         String[] answer;
    //         Arrays.sort(strings);
    //
    //         List<String> temp2 = new ArrayList<>();
    //
    //         for (char a = 'a'; a <= 'z'; a++) {
    //             for (String t : strings) {
    //                 if (t.charAt(n) == a) {
    //                     temp2.add(t);
    //                 }
    //             }
    //         }
    //
    //         answer = temp2.toArray(new String[0]);
    //
    //         return answer;
    //     }

    public static void main(String[] args) {
        q12915 q = new q12915();
        String[] result = q.solution(new String[]{"sun", "bed", "car"}, 1);
        System.out.println(Arrays.toString(result));
    }

}
