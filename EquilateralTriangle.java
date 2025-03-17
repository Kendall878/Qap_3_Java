// EquilateralTriangle class that extends Triangle and implements Scalable
public class EquilateralTriangle extends Triangle {
    private double side;

    public EquilateralTriangle(double side) {
        super(side, (Math.sqrt(3) / 2) * side); // Height calculated for equilateral triangle
        this.side = side;
    }

    @Override
    public void scale(double factor) {
        side *= factor;
        super.scale(factor); // Scale base and height
    }

    @Override
    public String toString() {
        return "Equilateral Triangle with side: " + side;
    }
}
