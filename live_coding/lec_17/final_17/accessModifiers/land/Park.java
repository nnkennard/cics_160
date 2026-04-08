package accessModifiers.land;

public class Park {
    public void parkMethod(){

        System.out.println("Inside a Park instance (same package, not a subclass).");
        System.out.println("Creating a Building instance.");
        Building b = new Building();
        String[] b_available = {b.protectedString, b.packagePrivateString, b.publicString
        };
        Building.printVisibleStrings(b_available);

        System.out.println("Not visible: private");
        System.out.println("Note: This is equivalent to when we created a Building object in land.Main.");
        //System.out.println(a.privateString);
    }
}