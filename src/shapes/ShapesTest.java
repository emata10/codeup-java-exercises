package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4, 5);
        System.out.println("Box1 perimeter: " + box1.getPerimeter()); // should be 18
        System.out.println("Box1 area: " + box1.getArea()); // should be 20

        Rectangle box2 = new Square(5);
        System.out.println("Box2 perimeter: " + box2.getPerimeter()); // should be 20
        System.out.println("Box2 area: " + box2.getArea()); // should be 25
    }
}


