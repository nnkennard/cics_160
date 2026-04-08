public class IntroInheritance {
    public static void main(String[] args) {

        Student mo = new Student("Moja", "Nap Studies");

        /*
         * = Q1 ================================================================
         * 
         * Add another constructor to Student. Ensure that the super keyword can
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

    // private String name;
    /*
     * Note: if the attribute declaration above is used instead, it leads to an error in
     * Student because name will not be visible to subclasses.
     */
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

    public Student(String m) {
        super("John Doe");
        major = m;
    }

    public String toString() {
        return name + "; " + major;
    }

}