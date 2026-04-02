public class Circle extends Shape{
    public double radius;
    static double PI = 3.14159;

    public Circle(Point pos, double rad){
        super(pos);
        radius = rad;
    }

    public double calculateArea(){
        return PI * radius * radius;
    }

}
