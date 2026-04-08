package solidInJava;
import java.util.ArrayList;

public class SingleResponsibility {
    public static void main(String[] args) {
        // Nothing here, never mind. Look at the classes
    }
}

abstract class Shape {
    // Nothing here, this is for demonstration purposes
}

class BadCanvas {
    private ArrayList<Shape> shapes = new ArrayList<>();

    public void addShape(Shape s) {
        shapes.add(s);
    }

    // ISSUE: Canvas should not need to know about file systems
    public void exportToPNG(String filename) {
        System.out.println("Exporting canvas to " + filename +
                ".png"); // It's a placeholder, ok?
    }
}

class GoodCanvas {
    private ArrayList<Shape> shapes = new ArrayList<>();

    public void addShape(Shape s) {
        shapes.add(s);
    }

    public ArrayList<Shape> getShapes() {
        return shapes;
    }
}

class ImageExporter {
    public void exportToPNG(GoodCanvas canvas, String filename) {
        System.out.println("Exporting canvas to " + filename +
                ".png"); // It's a placeholder, ok?
    }

}