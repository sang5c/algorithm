package programmers.level1;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12919
 * Title: 서울에서 김서방 찾기
 * Date: 2020-09-15
 */
public class q12919 {
    public String solution(String[] seoul) {
        int index = -1;
        for (int i = 0; i < seoul.length; i++) {
            if ("Kim".equals(seoul[i])) {
                index = i;
            }
        }
        return "김서방은 " + index + "에 있다";
    }

    public static void main(String[] args) {
        q12919 q = new q12919();
        String result = q.solution(new String[]{"Jane", "Kim"});
        System.out.println(result);
    }

}
