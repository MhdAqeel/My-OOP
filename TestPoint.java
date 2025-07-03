public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        Point p2 = new Point(6, 8);

        System.out.println("Point 1: " + p1);
        System.out.println("Point 2: " + p2);

        System.out.println("Distance from p1 to origin: " + p1.distance());
        System.out.println("Distance from p1 to (7, 1): " + p1.distance(7, 1));
        System.out.println("Distance from p1 to p2: " + p1.distance(p2));
    }
}
