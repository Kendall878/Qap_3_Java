// Ellipse class that extends Shape and implements Scalable
public class Ellipse extends Shape implements Scalable {
    private double majorAxis;
    private double minorAxis;

    public Ellipse(double majorAxis, double minorAxis) {
        this.majorAxis = majorAxis;
        this.minorAxis = minorAxis;
    }

    @Override
    public void scale(double factor) {
        majorAxis *= factor;
        minorAxis *= factor;
    }

    @Override
    public String toString() {
        return "Ellipse with major axis: " + majorAxis + " and minor axis: " + minorAxis;
    }
}
