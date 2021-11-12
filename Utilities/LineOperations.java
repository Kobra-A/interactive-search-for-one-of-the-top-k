package Utilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Models.Point;

public class LineOperations {
    // Compute the interactions between t and l_i and save it in HashMap(Point,Interaction)
    public static Point getInteraction(float slope, float intercept, float utilityLine) {
        return new Point(utilityLine, (slope) * utilityLine + intercept);
    }
    public static ArrayList<Point> getOrderedInteractions(ArrayList<Point> points, float utilityLine) {
        ArrayList<Point> Interactions = new ArrayList<Point>();
        for (Point point : points) {
            Interactions.add(LineOperations.getInteraction(point.x - point.y, point.y, utilityLine));
        }
        Collections.sort(intersections, new Comparator<Point>() {
            @Override
            public int compare(Point a, Point b) {
                return Float.compare(a.y, b.y);
            }
        });
        return Interactions;
    }
}
