package programmers.level1;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12928
 * Title: 약수의 합
 * Date: 2020-09-16
 */
public class q12928 {
    public int solution(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        q12928 q = new q12928();
        int result = q.solution(12);
        System.out.println(result);
    }

}
