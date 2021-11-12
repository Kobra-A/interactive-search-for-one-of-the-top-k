package Utilities;

import java.util.Comparator;
import java.util.HashMap; 

import Models.Point;

public class LineOperations {
    // Compute the interactions between t and l_i 
    public static Point getInteraction(float slope, float intercept, float utilityLine) {
        return new Point(utilityLine, (slope) * utilityLine + intercept);
    }
    // Compute the intersection between l_i and l_j
    public static Point getIntersection(float slope1, float slope2, float intercept1, float intercept2){
        return new Point((intercept2-intercept1)/(slope1-slope2),(slope1*((intercept2-intercept1)/(slope1-slope2)))+slope1);
    } 
    public static ArrayList<Point> getOrderedInteractions(ArrayList<Point> points, float utilityLine) {
        //save interactions in HashMap(Point,Interaction)
        HashMap<Point,Point> Interactions = new HashMap<Point,Pint>();
        for (Point point : points) {
            Interactions.put(point, LineOperations.getInteraction(point.x - point.y, point.y, utilityLine));
        }
        
        HashMap<Point,Point> SortedInteractions = new HashMap<Point,Point>();
        SortedInteractions.putAll(sortByValue(Interactions));
 
        return Interactions;
    }
}
