package programmers.level1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12901
 * Title: 2016년
 * Date: 2020-09-08
 */
public class q12901 {
    public String solution(int a, int b) {
        LocalDate localDate1 = LocalDate.of(2016, 1, 1);
        LocalDate localDate2 = LocalDate.of(2016, a, b);
        return Day.values()[(int)ChronoUnit.DAYS.between(localDate1, localDate2) % 7 + 6].toString();
    }

    enum Day {
        SUN, MON, TUE, WED, THU, FRI, SAT
    }

    public static void main(String[] args) {
        q12901 q = new q12901();
        String result = q.solution(5, 24);
        System.out.println(result);
    }

}
