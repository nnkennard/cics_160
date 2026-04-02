public class Rectangle extends Shape{
    public double length, width;

    public Rectangle(Point position, double length, double width){
        super(position);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea(){
        return length * width;
    }

}