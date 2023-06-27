package shapes;
public class ShapesTest {
    private static double side;

    public static void main(String[] args) {
        Quadrilateral.Measurable myShape;

        Rectangle rect = new Rectangle(4, 5, side);
        System.out.println("Rectangle perimeter: " + rect.getPerimeter());
        System.out.println("Rectangle area: " + rect.getArea());
        myShape = rect;

        Square sqr = new Square(5);
        System.out.println("Square perimeter: " + sqr.getPerimeter());
        System.out.println("Square area: " + sqr.getArea());
        myShape = (Quadrilateral.Measurable) sqr;
    }
}


