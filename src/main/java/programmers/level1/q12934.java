package programmers.level1;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12934
 * Title: 정수 제곱근 판별
 * Date: 2020-09-19
 */
public class q12934 {
    public long solution(long n) {
        double sqrt = Math.sqrt(n);
        long longSqrt = (long) sqrt;
        return sqrt == longSqrt ? (long) Math.pow(sqrt + 1, 2) : -1;
    }

    public static void main(String[] args) {
        q12934 q = new q12934();
        long result = q.solution(121);
        System.out.println(result);
    }

}
