// Triangle class that extends Shape and implements Scalable
public class Triangle extends Shape implements Scalable {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void scale(double factor) {
        base *= factor;
        height *= factor;
    }

    @Override
    public String toString() {
        return "Triangle with base: " + base + " and height: " + height;
    }
}
