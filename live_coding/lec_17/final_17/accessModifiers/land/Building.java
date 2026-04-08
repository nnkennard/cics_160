package accessModifiers.land;

public class Building {
    private String privateString = "private";
    protected String protectedString = "protected";
    String packagePrivateString = "default";
    public String publicString = "public";

    public static void printVisibleStrings(String[] stringsToPrint){
        System.out.println("Visible: " + String.join(", ", stringsToPrint));
    }
    
    public void buildingMethod(){
        System.out.println("Inside a Building instance.");
        String[] available = {
            privateString, protectedString, packagePrivateString, publicString
        };
        printVisibleStrings(available);
    }



}
