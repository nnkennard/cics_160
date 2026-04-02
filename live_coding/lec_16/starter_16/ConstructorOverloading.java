public class ConstructorOverloading {
    public static void main(String[] args) {

        /*
         * = Q1 ================================================================
         * 
         * Create multiple constructors for the Cat class below, such that the
         * code in this main method gives the results shown below.
         * 
         * Ru, born 2022
         * Socks, born 2026
         * Jane Doe, born 2026
         * 
         */

        Cat a = new Cat("Ru", 2022);
        Cat b = new Cat("Socks");
        Cat c = new Cat();

        a.speak();
        b.speak();
        c.speak();

    }
}

class Cat {
    String name;
    int birthYear; // int is a terrible choice for a year!

    public void speak() {
        System.out.println(name + ", born " + birthYear);
    }
}