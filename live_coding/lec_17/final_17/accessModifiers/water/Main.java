package accessModifiers.water;

import accessModifiers.land.Building;

public class Main {

    public static void printSeparator(){
        System.out.println("============================================================");
    }
    public static void main(String[] args) {
         printSeparator();
        System.out.println("In the water package.");

        printSeparator();
        System.out.println("Creating a CruiseShip instance.");
        CruiseShip c = new CruiseShip();
        c.cruiseShipMethod();
        printSeparator();
        System.out.println("Accessing inherited attributes of a CruiseShip instance from a different package");
        String[] c_available = {  c.publicString
        };
        Building.printVisibleStrings(c_available);
        System.out.println("Not visible: private, protected, package-private");
        // System.out.println(c.privateString);
        // System.out.println(c.protectedString);
        // System.out.println(c.packagePrivateString);

        printSeparator();
        System.out.println("Creating a Sailboat instance.");
        Sailboat s = new Sailboat();
        s.sailboatMethod();
        printSeparator();


    }
    
}
