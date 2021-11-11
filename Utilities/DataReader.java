package Utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import Models.Point;

public class DataReader {
    public ArrayList<Point> getData(String fileName) {
        ArrayList<Point> points = new ArrayList<Point>();
        try (BufferedReader br = new BufferedReader(new FileReader("C:/workspace/java/interactive-search-for-one-of-the-top-k/input/" + fileName))) {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                ArrayList<Float> convertedPoints  = new ArrayList<Float>();
                var currPoints = line.split(" ");
                for (String point : currPoints) {
                    convertedPoints.add(Float.parseFloat(point));
                }
                points.add(new Point(convertedPoints.get(0), convertedPoints.get(1)));
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return points;
    }
}
