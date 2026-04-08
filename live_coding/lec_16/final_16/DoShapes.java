public class DoShapes {
    public static void main(String[] args) {
        Point origin = new Point(0.0, 0.0);

        Rectangle r = new Rectangle(origin, 1.5, 3.0);
        Rectangle r2 = new Rectangle(4.9, 3.7);
        Square s = new Square(origin, 1.5);
        Circle c = new Circle(origin, 5);

        /*
         * Even though Shape has a constructor with no parameters, this line
         * causes a problem if uncommented because Shape is abstract and cannot
         * be instantiated.
         * 
         */
        // Shape a = new Shape();

        Point somewhere = new Point(10.0, 15.6);
        r.move(somewhere);
        s.move(somewhere);
        c.move(somewhere);

        System.out.println(r.calculateArea());
        System.out.println(r2.calculateArea());
        System.out.println(s.calculateArea());
        System.out.println(c.calculateArea());
    }
}

abstract class Shape {
    Point position;

    /*
     * An abstract class can have a constructor, but no objects will be
     * instantiated using it.
     */
    public Shape() {
        position = new Point(0.0, 0.0);
    }

    public void move(Point newPos) {
        position = newPos;
    }

    public abstract double calculateArea();

}

class Rectangle extends Shape {
    // private Point position;
    private double length, width;

    public Rectangle(Point p, double l, double w) {
        position = p;
        length = l;
        width = w;
    }

    public Rectangle(double l, double w) {
        super();
        length = l;
        width = w;

    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

class Square extends Rectangle {

    public Square(Point p, double s) {
        super(p, s, s);
    }
}

class Circle extends Shape {
    // private Point position;
    private double radius;
    static double PI = 3.14159;

    public Circle(Point p, double r) {
        position = p;
        radius = r;
    }

    public double calculateArea() {
        return PI * radius * radius;
    }
}