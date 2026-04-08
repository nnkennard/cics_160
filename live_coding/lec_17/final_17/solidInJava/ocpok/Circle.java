package solidInJava.ocpok;

public class Circle implements Shape {
    public static double PI = 3.14159;
    public double radius;
    Circle(double r){
        this.radius = r;
    }
    public double calculateArea(){
        return PI * radius * radius;
    }
}

