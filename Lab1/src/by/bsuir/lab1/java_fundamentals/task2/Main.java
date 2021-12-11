package by.bsuir.lab1.java_fundamentals.task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Point> polygon = new ArrayList<Point>();
        polygon.add(new Point(4, 5));
        polygon.add(new Point(-4, 5));
        polygon.add(new Point(-4, 0));
        polygon.add(new Point(-6, 0));
        polygon.add(new Point(-6, -3));
        polygon.add(new Point(6, -3));
        polygon.add(new Point(6, 0));
        polygon.add(new Point(4, 0));

        System.out.println(isPointInPolygon(new Point(3, 2), polygon));
        System.out.println(isPointInPolygon(new Point(100, 100), polygon));
    }

    public static boolean isPointInPolygon(Point point, ArrayList<Point> polygon) {
        boolean result = false;
        int j = polygon.size() - 1;

        for (int i = 0; i < polygon.size(); i++) {
            if ((((polygon.get(i).y < point.y) && (point.y < polygon.get(j).y))
                    || ((polygon.get(j).y <= point.y) && (point.y < polygon.get(i).y)))
                    && (point.x > (polygon.get(j).x - polygon.get(i).x) * (point.y - polygon.get(i).y)
                            / (polygon.get(j).y - polygon.get(i).y) + polygon.get(i).x))
                result = !result;
            j = i;
        }

        return result;
    }
}
