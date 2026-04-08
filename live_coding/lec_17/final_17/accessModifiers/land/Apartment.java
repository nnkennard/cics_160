package accessModifiers.land;

public class Apartment extends Building {
    public void apartmentMethod(){

        System.out.println("Inside an Apartment instance (subclass, same package).");
        String[] available = {protectedString, packagePrivateString, publicString
        };
        printVisibleStrings(available);
        System.out.println("Not visible: private");
        //System.out.println(privateString);
    }
}
