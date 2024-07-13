package practice.practice_system_geometric_object;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("red", false);
        System.out.println(shape);
        System.out.println();
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(2.0);
        System.out.println(circle);
        circle = new Circle("blue", false, 3.0);
        System.out.println(circle);
        System.out.println();
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(2.0,4.0);
        System.out.println(rectangle);
        rectangle = new Rectangle("black", false, 2.0, 6.0);
        System.out.println(rectangle);
        System.out.println();
        Square square = new Square();
        System.out.println(square);
        square = new Square(2.8);
        System.out.println(square);
        square = new Square("yellow", false, 3.8);
        System.out.println(square);
    }
}
