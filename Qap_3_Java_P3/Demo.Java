public class Demo {
    public static void main(String[] args) {
        // Test Point class
        Point p1 = new Point(1.1f, 2.2f);
        System.out.println("Point: " + p1);

        // Test MovablePoint class
        MovablePoint mp1 = new MovablePoint(3.3f, 4.4f, 0.5f, 1.5f);
        System.out.println("MovablePoint before move: " + mp1);

        // Move the MovablePoint
        mp1.move();
        System.out.println("MovablePoint after move: " + mp1);

        // Additional move
        mp1.move();
        System.out.println("MovablePoint after another move: " + mp1);
    }
}
