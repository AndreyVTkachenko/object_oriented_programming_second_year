package lesson.example_03;

public class Program {

    public static void main(String[] args) {

        Point2D a = new Point2D(0, 2);
        System.out.println(a.getX());
        System.out.println(a.getY());
        System.out.println(a);

        Point2D b = new Point2D(10);
        System.out.println(b);

        double distance = Point2D.distance(a, b);
        System.out.println(distance);
    }
}
