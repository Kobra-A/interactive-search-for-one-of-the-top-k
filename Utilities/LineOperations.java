package Utilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Models.Point;

public class LineOperations {
    public static Point getIntersection(float slope, float intercept, float utilityLine) {
        return new Point(utilityLine, (slope) * utilityLine + intercept);
    }

    public static ArrayList<Point> getOrderedIntersections(ArrayList<Point> points, float utilityLine) {
        ArrayList<Point> intersections = new ArrayList<Point>();
        for (Point point : points) {
            intersections.add(LineOperations.getIntersection(point.x - point.y, point.y, utilityLine));
        }
        Collections.sort(intersections, new Comparator<Point>() {
            @Override
            public int compare(Point a, Point b) {
                return Float.compare(a.y, b.y);
            }
        });
        return intersections;
    }
}
