package programmers.level1;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12943
 * Title: 콜라츠 추측
 * Date: 2020-09-21
 */
public class q12943 {
    public int solution(int num) {
        int cnt = 0;
        long result = num;
        while (result != 1) {
            if (result % 2 == 0) {
                result /= 2;
            } else {
                result = result * 3 + 1;
            }
            if (++cnt >= 500) {
                return -1;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        q12943 q = new q12943();
        int result = q.solution(626331);
        System.out.println(result);
    }

}
