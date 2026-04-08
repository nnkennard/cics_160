package solidInJava.dip;

public class DigitalStudio {
    private DrawingTablet tablet;
    // The dependency is "injected" via the constructor.
    // DigitalStudio doesn't care what kind of tablet it is

    public DigitalStudio(DrawingTablet tablet) {
        this.tablet = tablet;
    }

    public void startDrawing() {
        tablet.readStylusInput();
    }
}