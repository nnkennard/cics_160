public class DoShapes {
    public static void main(String[] args) {
        Point origin = new Point(0.0, 0.0);

        Rectangle r = new Rectangle(origin, 1.5, 3.0);
        Square s = new Square(origin, 1.5);
        Circle c = new Circle(origin, 5);

        Point somewhere = new Point(10.0, 15.6);
        r.move(somewhere);
        s.move(somewhere);
        c.move(somewhere);
        
        System.out.println(r.calculateArea());
        System.out.println(s.calculateArea());
        System.out.println(c.calculateArea());
    }
}
