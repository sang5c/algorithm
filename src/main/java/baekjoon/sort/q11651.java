package baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://www.acmicpc.net/problem/q11651
 * Title: 좌표 정렬하기 2
 * Date: 2021-05-10
 * Type: sort
 */
public class q11651 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        List<Point> points = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String[] input = reader.readLine().split(" ");
            points.add(new Point(input[0], input[1]));
        }

        Collections.sort(points);
        for (Point point : points) {
            System.out.println(point);
        }
    }

    static class Point implements Comparable<Point> {
        private final int x;
        private final int y;

        public Point(String x, String y) {
            this.x = Integer.parseInt(x);
            this.y = Integer.parseInt(y);
        }

        @Override
        public int compareTo(Point o) {
            return this.y != o.y ? this.y - o.y : this.x - o.x;
        }

        @Override
        public String toString() {
            return x + " " + y;
        }

    }

}
