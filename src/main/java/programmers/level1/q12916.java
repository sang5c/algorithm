package programmers.level1;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12916
 * Title: 문자열 내 p와 y의 개
 * Date: 2020-09-14
 */
public class q12916 {
    boolean solution(String s) {
        int pCount = 0;
        int yCount = 0;
        char[] chars = s.toLowerCase().toCharArray();
        for (char c : chars) {
            if (c == 'p') {
                pCount++;
            } else if (c == 'y') {
                yCount++;
            }
        }
        return pCount == yCount;
    }

    boolean solution2(String s) {
        String lowerCaseStr = s.toLowerCase();
        return lowerCaseStr.chars().filter(c -> c == 'p').count() == lowerCaseStr.chars().filter(c -> c == 'y').count();
    }

    public static void main(String[] args) {
        q12916 q = new q12916();
        boolean result = q.solution2("pPoooyY");
        System.out.println(result);
    }

}
