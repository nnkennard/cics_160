public class IntroOverriding {
    public static void main(String[] args) {

        Student mo = new Student("Moja", "Nap Studies");
        Person neha = new Person("Neha Kennard");

        System.out.println(convertToString(neha));
        System.out.println(convertToString(mo));

    }

    static String convertToString(Person p){
        return p.toString();
    }
}

class Person {

    String name;

    public Person(String n) {
        name = n;
    }

    public Person() {
        name = "John Doe";
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
        super();
        major = m;
    }

    public String toString() {
        return name + "; " + major;
    }

}