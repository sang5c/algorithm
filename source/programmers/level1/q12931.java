package programmers.level1;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12931
 * Title: 자릿수 더하기
 * Date: 2020-09-17
 */
public class q12931 {
    public int solution(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        q12931 q = new q12931();
        int result = q.solution(987);
        System.out.println(result);
    }

}
