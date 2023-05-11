package day4.bai6_2;

public class Main {
    public static void main(String[] args) {
        GeometricObject circle = new Circle(5.0);
        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Circle perimeter: " + circle.getPerimeter());

        GeometricObject rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());
    }
}
