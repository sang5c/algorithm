package programmers.level1;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12930
 * Title: 이상한 문자 만들기
 * Date: 2020-09-16
 */
public class q12930 {
    public String solution(String s) {
        char[] chars = s.toCharArray();
        int cnt = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                cnt = 0;
                continue;
            }

            if (cnt++ % 2 == 0) {
                chars[i] = Character.toUpperCase(chars[i]);
            } else {
                chars[i] = Character.toLowerCase(chars[i]);
            }
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        q12930 q = new q12930();
        String result = q.solution("try hello world");
        System.out.println(result);
    }

}
