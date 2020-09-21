package programmers.level1;

import java.util.Scanner;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12969
 * Title: 직사각형 별찍기
 * Date: 2020-09-21
 */
public class q12969 {
    private static final String STAR = "*";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < a; i++) {
            stringBuilder.append(STAR);
        }
        String stars = stringBuilder.toString();
        for (int i = 0; i < b; i++) {
            System.out.println(stars);
        }
    }

}
