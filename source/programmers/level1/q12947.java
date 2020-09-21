package programmers.level1;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12947
 * Title: 하샤드 수
 * Date: 2020-09-21
 */
public class q12947 {
    public boolean solution(int x) {
        int positionSum = 0;
        int temp = x;
        while (temp > 0) {
            positionSum += temp % 10;
            temp /= 10;
        }
        return x % positionSum == 0;
    }

    public static void main(String[] args) {
        q12947 q = new q12947();
        boolean result = q.solution(11);
        System.out.println(result);
    }

}
