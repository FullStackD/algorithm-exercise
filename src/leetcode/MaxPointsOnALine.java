package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Definition for a point.
 * class Point {
 * int x;
 * int y;
 * Point() { x = 0; y = 0; }
 * Point(int a, int b) { x = a; y = b; }
 * }
 */
public class MaxPointsOnALine {

    public int maxPoints(Point[] points) {
        if (points == null || points.length == 0) {
            return 0;
        }
        if (points.length == 1) {
            return 1;
        }
        int maxNum = 0;
        for (int i = 0; i < points.length; i++) {
            Map<Float, Integer> map = new HashMap<>();
            int repeatedNum = 1;//和points[i]重复的点的数量
            int noSlopeNum = 0;//无斜率的线上的点的数量（垂直于x轴）
            for (int j = i + 1; j < points.length; j++) {
                if (points[i].x == points[j].x) {// 特殊点
                    if (points[i].y == points[j].y) {
                        repeatedNum++;
                    } else {
                        noSlopeNum++;
                    }
                } else {
                    int son = points[i].y - points[j].y == 0 ? 0 : points[i].y - points[j].y;
                    float slope = son / (float) (points[i].x - points[j].x);
                    if (son == 0) {
                        slope = Math.abs(slope);
                    }
                    if (map.get(slope) == null) {
                        map.put(slope, 1);
                    } else {
                        map.put(slope, map.get(slope) + 1);
                    }
                }
            }
            int max = noSlopeNum;//points[i]所在的直线最大数量
            for (int x : map.values()) {
                max = Math.max(x, max);
            }
            maxNum = Math.max(maxNum, max + repeatedNum);
        }
        return maxNum;
    }

    class Point {
        int x;
        int y;

        Point() {
            x = 0;
            y = 0;
        }

        Point(int a, int b) {
            x = a;
            y = b;
        }
    }

}



