package programmers.level1;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12903
 * Title: 가운데 글자 가져오기
 * Date: 2020-09-10
 */
public class q12903 {
    public String solution(String s) {
        int halfLength = s.length() / 2;
        if (s.length() % 2 == 0) {
            return s.substring(halfLength - 1, halfLength + 1);
        }
        return s.substring(halfLength, halfLength + 1);
    }

    public static void main(String[] args) {
        q12903 q = new q12903();
        String result = q.solution("abcde");
        System.out.println(result);
    }

}
