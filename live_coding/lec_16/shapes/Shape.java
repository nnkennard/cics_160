public abstract class Shape {
    public Point position;

    public Shape(Point pos){
        position = pos;
    }

    public void move(Point newPos){
        position = newPos;
    }

    abstract public double calculateArea();
}
