package shapes;
public class Rectangle extends Quadrilateral implements Quadrilateral.Measurable {

    public Rectangle(double length, double width, double side) {
        super(length, width, side, side);
    }

    public Rectangle(double length, double width, double side, double v) {
        super(length, width, side, v);
    }

    @Override
    public void setLength(double length) {

    }

    @Override
    public void setWidth(double width) {

    }

    @Override
    public double getPerimeter() {
        return 2 * (getLength() + getWidth());
    }

    @Override
    public double getArea() {
        return getLength() * getWidth();
    }
}
//public class Rectangle {
//    protected double length;
//    protected double width;
//
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//    public double getArea() {
//
//        return length * width;
//    }
//
//    public double getPerimeter() {
//
//        return (2 * length) + (2 *width);
//    }
//}
//    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle(5.5, 5.5);
//
//        System.out.println("rectangle.getArea() = " + rectangle.getArea());
//        System.out.println("rectangle.getPerimeter() = " + rectangle.getPerimeter());
