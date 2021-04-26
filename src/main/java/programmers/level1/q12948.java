package programmers.level1;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12948
 * Title: 핸드폰 번호 가리기
 * Date: 2020-09-21
 */
public class q12948 {
    public String solution(String phoneNumber) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < phoneNumber.length()-4; i++) {
            stringBuilder.append("*");
        }
        stringBuilder.append(phoneNumber.substring(phoneNumber.length() - 4));
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        q12948 q = new q12948();
        String result = q.solution("01033334444");
        System.out.println(result);
    }

}
