import java.util.Arrays;

public class ForEachReference {

    public static void main(String[] args) {
        Cat mo = new Cat("Mo");
        Cat ru = new Cat("Ru");

        Cat[] kennard_household = { mo, ru };

        System.out.println(Arrays.toString(kennard_household));
        for (Cat c : kennard_household) {
            c.setName("Tunky");
        }

        System.out.println(Arrays.toString(kennard_household));
    }

}

class Cat {

    String name;

    public Cat(String n) {
        name = n;
    }

    public void setName(String newName){
        name = newName;
    }

    public void speak() {
        System.out.println("Hi, I'm " + name +"!");
    }

    public String toString() {
        return name;
    }
}
