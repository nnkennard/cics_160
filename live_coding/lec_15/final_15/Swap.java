import java.util.Arrays;

public class Swap {

    public static void swapCats(Cat cat1, Cat cat2){
        Cat temp = cat1;
        cat1 = cat2;
        cat2 = temp;
    }

    public static void arraySwapCats(Cat[] cats){
        Cat temp = cats[0];
        cats[0] = cats[1];
        cats[1] = temp;
    }

    public static void main(String[] args) {
        Cat mo = new Cat("Mo", "hi mom");
        Cat ru = new Cat("Ru", "bye mom");

        System.out.println("Before and after swapping individual cats in method");
        System.out.println(mo + " " + ru);
        swapCats(mo, ru);
        System.out.println(mo + " " + ru);

        System.out.println("Before and swapping cat array in method");
        Cat[] kennard_household = { mo, ru };
        System.out.println(Arrays.toString(kennard_household));
        arraySwapCats(kennard_household);
        System.out.println(Arrays.toString(kennard_household));
    }

}

class Cat {

    String name;

    public Cat(String n, String c) {
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
