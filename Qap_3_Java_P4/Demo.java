public class Demo {
    // Static method to scale all Scalable objects in array
    public static void scaleAll(Scalable[] objects, double factor) {
        for (Scalable obj : objects) {
            obj.scale(factor); // Call scale
        }
    }

    public static void main(String[] args) {
        // Creating objects
        Circle c = new Circle(5);
        Ellipse e = new Ellipse(10, 5);
        Triangle t = new Triangle(6, 8);
        EquilateralTriangle eq = new EquilateralTriangle(4);

        // Array of Scalable type
        Scalable[] shapes = { c, e, t, eq };

        // Print before scaling
        System.out.println("Shapes before scaling:");
        for (Scalable s : shapes) {
            System.out.println(s);
        }

        // Scaling all shapes by a factor of 2
        double scaleFactor = 2.0;
        scaleAll(shapes, scaleFactor);

        // Print after scaling
        System.out.println("\nShapes after scaling by factor of " + scaleFactor + ":");
        for (Scalable s : shapes) {
            System.out.println(s);
        }
    }
}
