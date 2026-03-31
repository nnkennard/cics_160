package packageintro;
import packageintro.shapes.*;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(1.3);
        Square s = new Square(4.5);
        System.out.println(c.getRadius() + " " + s.getSide());
    }
}
