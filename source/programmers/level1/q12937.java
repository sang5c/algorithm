package programmers.level1;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12937
 * Title: 짝수와 홀수
 * Date: 2020-09-19
 */
public class q12937 {
    public String solution(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        q12937 q = new q12937();
        String result = q.solution(3);
        System.out.println(result);
    }

}
