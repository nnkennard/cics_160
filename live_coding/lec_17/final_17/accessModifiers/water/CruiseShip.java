package accessModifiers.water;

import accessModifiers.land.Building;

public class CruiseShip extends Building {
    public void cruiseShipMethod(){

        System.out.println("Inside a CruiseShip instance (subclass, different package).");
        String[] available = {protectedString, publicString
        };
        printVisibleStrings(available);
        System.out.println("Not visible: private, packagePrivate");
        // System.out.println(privateString);
        // System.out.println(packagePrivateString);
    }
}
