package solidInJava.ocpmistake;

public class AreaCalculator{
    public double calculateRectangleArea(Rectangle r){
        return r.length * r.width;
    }
    public double calculateCircleArea(Circle c){
        return Circle.PI * c.radius * c.radius;
    }
}