public class IntroInheritance {
    public static void main(String[] args) {

        Student mo = new Student("Moja", "Nap Studies");

        /*
         * = Q1 ================================================================
         * 
         * Add another constructor to Person. Ensure that the super keyword can
         * be used with all overloaded constructors, just using different
         * parameters.
         * 
         * Uncomment the line below. It should work given the new constructor.
         */
        Student ru = new Student("Entomology");

        System.out.println(mo);
        System.out.println(ru);

    }
}

class Person {

    String name;

    public Person(String n) {
        name = n;
    }

    public String toString() {
        return name;
    }

}

class Student extends Person {

    private String major;

    public Student(String n, String m) {
        super(n);
        major = m;
    }

    public String toString() {
        return name + "; " + major;
    }

}