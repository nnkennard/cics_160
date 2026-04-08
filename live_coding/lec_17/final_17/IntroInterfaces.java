interface Fillable {
    abstract boolean isFull();
    abstract boolean isEmpty();
}

class Glass implements Fillable {
    double waterLevel, volume;

    Glass(double volume) {
        this.volume = volume;
        waterLevel = 0.0;
    }

    public boolean isEmpty() {
        return waterLevel == 0.0;
    }

    public boolean isFull() {
        return waterLevel == volume;
    }

}

class Course implements Fillable {
    int registered, numSeats;

    Course(int numSeats) {
        this.numSeats = numSeats;
        registered = 0;
    }

    public boolean isEmpty() {
        return registered == 0;
    }

    public boolean isFull() {
        return registered >= numSeats;
    }
}

class EggCarton implements Fillable{
    static int MAX = 12;
    int numEggs;
    EggCarton(){
        numEggs = 12;
    }

    public boolean isEmpty(){
        return numEggs == 0;
    }
    
    public boolean isFull(){
        return numEggs == MAX;
    }
}

public class IntroInterfaces {

    public static void main(String[] args) {
        Glass g = new Glass(16.0);
        Course c = new Course(120);
        EggCarton e = new EggCarton();

        System.out.println("Glass is empty? " + g.isEmpty());
        System.out.println("Course is empty? " + c.isEmpty());
        System.out.println("Egg carton is full? " + e.isFull());

    }
}
