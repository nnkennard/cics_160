package accessModifiers.land;

public class Main {

    public static void printSeparator(){
        System.out.println("============================================================");
    }
    public static void main(String[] args) {

        printSeparator();
        System.out.println("In the land package.");

        printSeparator();
        System.out.println("Creating a Building instance.");
        Building b = new Building();
        b.buildingMethod();
        printSeparator();
        System.out.println("Accessing attributes of a Building instance from the same package");
        String[] b_available = { 
            b.protectedString, b.packagePrivateString, b.publicString
        };
        Building.printVisibleStrings(b_available);
        System.out.println("Not visible: private");
        // System.out.println(b.privateString);

        printSeparator();
        System.out.println("Creating an Apartment instance.");
        Apartment a = new Apartment();
        a.apartmentMethod();
        printSeparator();
        System.out.println("Accessing attributes of a subclass (Apartment) instance from the same package");
        String[] a_available = {
            a.protectedString, a.packagePrivateString, a.publicString
        };
        Building.printVisibleStrings(a_available);
        System.out.println("Not visible: private");
        // System.out.println(a.privateString);

        printSeparator();
        System.out.println("Creating a Park instance.");
        Park p = new Park();
        p.parkMethod();
        printSeparator();
        System.out.println("Park instances (obviously) don't inherit any attributes from Building.");
    


    }
}
