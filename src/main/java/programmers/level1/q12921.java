package programmers.level1;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12921
 * Title: 수박수박수박수박수박수
 * Date: 2020-09-15
 */
public class q12921 {
    public String solution(int n) {
        String subak = "수박";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 2; i <= n; i += 2) {
            stringBuilder.append(subak);
        }

        if (n % 2 != 0) {
            stringBuilder.append("수");
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        q12921 q = new q12921();
        String result = q.solution(4);
        System.out.println(result);
    }

}
