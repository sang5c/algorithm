package programmers.level1;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12925
 * Title: 문자열을 정수로 바꾸기
 * Date: 2020-09-15
 */
public class q12925 {
    public int solution(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        q12925 q = new q12925();
        int result = q.solution("-1234");
        System.out.println(result);
    }

}
