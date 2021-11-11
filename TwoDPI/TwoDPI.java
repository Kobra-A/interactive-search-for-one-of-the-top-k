package TwoDPI;

import java.util.ArrayList;

import Models.Point;
import Utilities.LineOperations;

public class TwoDPI {
    public void performSpacePartitioning(ArrayList<Point> points, int k) {
        ArrayList<ArrayList<Float>> partitions;
        var currPartition = new Float[] { 0f, 1f };
        ArrayList<Point> orderedPoints;
        int x = 1;

        ArrayList<Point> q = new ArrayList<Point>();
        q.addAll(LineOperations.getOrderedIntersections(points, currPartition[0]));
        labelFirstKElements(q, k, x);
    }

    public void labelFirstKElements(ArrayList<Point> q, int k, int label) {
        for(int i = 0; i<k; i++) {
            q.get(i).label = label;
        }
    }
}
