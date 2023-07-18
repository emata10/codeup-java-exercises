package shapes;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 2 * Math.PI * this.radius;
    }

    public Object getCircumference() {
        return null;
    }
}
