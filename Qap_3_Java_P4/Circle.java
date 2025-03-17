// Circle class that extends Shape and implements Scalable
public class Circle extends Shape implements Scalable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void scale(double factor) {
        radius *= factor; // Scaling radius
    }

    @Override
    public String toString() {
        return "Circle with radius: " + radius;
    }
}
