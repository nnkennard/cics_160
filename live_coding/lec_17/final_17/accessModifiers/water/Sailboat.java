package accessModifiers.water;

import accessModifiers.land.Building;

public class Sailboat {
    public void sailboatMethod(){

        System.out.print("Inside a method of Sailboat (subclass, different package): ");
        
        System.out.println("Creating a Building instance.");
        Building b = new Building();

        String[] b_available = {b.publicString};
        Building.printVisibleStrings(b_available);

        System.out.println("Not visible: private, protected, packagePrivate");
        System.out.println("Note: This is equivalent to how we created a Building object in main.");
        //System.out.println(a.privateString);
    }
}
